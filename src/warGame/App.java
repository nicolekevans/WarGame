package warGame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	//random avaible names for players
List <String> names = List.of("General Custard", "Napolean Bonapart", "Dwight D. Eisenhower", "Ulysses Grant", "Alexander the Great");
Random random = new Random();
	
	
	public static void main(String[] args) {
		new App().playGame();

	}
		
	private void playGame() {
		Deck deck = new Deck();
		List<String> generals = new LinkedList<>(names);
		
		Player player1 = findPlayer(generals);
		Player player2 = findPlayer(generals);
		
		
		shuffleDeck(deck);
		dealTheCards(deck, player1, player2);
		playWar(player1, player2);
		findTheWinner(player1, player2);
		
	}
	//Compares scores to assign winner
	private void findTheWinner(Player player1, Player player2) {
		if (player1.getScore()> player2.getScore()) {
			System.out.println (player1 + " is the winner with a score of "+ player1.getScore());
			System.out.println (player2 + " is the loser with a score of "+ player2.getScore());
		}
		else if (player2.getScore()>player1.getScore()) {
			System.out.println( player2 + " is the winner with a score of " + player2.getScore());
			System.out.println (player1 + " is the loser with a score of "+ player1.getScore());
		}
		else {
			System.out.println ("The Game is a tie");
		}
		
	}
 // takes care of flipping of cards and comparing which is bigger 
	private void playWar(Player player1, Player player2) {
		int numCards = player1.getHand().size();
		
		for(int turn = 0; turn<numCards; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			if(card1.getRank() > card2.getRank()) {
				player1.incrementScore();
			}
			else if (card2.getRank()> card1.getRank()) {
				player2.incrementScore();
			}
			
			
		}
		
	}
// deals the cards out to each player
	private void dealTheCards(Deck deck, Player player1, Player player2) {
		int deckSize =52;
		
		for (int index = 0; index < deckSize; index++) {
			if(index %2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
	}
//randomizes the order of the deck
	private void shuffleDeck(Deck deck ) {
		Collections.shuffle(deck.getCards());
	}
	//chooses names for the players
	private Player findPlayer(List<String>names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		
		return new Player(name);
	}
	
}
