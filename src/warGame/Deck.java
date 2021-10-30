package warGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	List<String> suits =List.of("Spades", "Hearts", "Diamonds", "Clubs");
	List<String> values =List.of("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace");
	List<Card> cards = new LinkedList<>();
	
	public Deck() {
		for(int index = 0; index < values.size(); index ++) {
			String value = values.get(index);
			int rank = index + 1;
			
			for(String suit : suits) {
				cards.add(new Card(value, suit, rank));
			}
			
		}
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("\nCards in deck: \n");
		for (Card card:cards) {
			b.append(card).append("\n");
		}
		
		return b.toString();
	}
	
	
	public List<Card> getCards(){
		return cards;
	}
	
	public void shuffle() {
		Random random = new Random();
		List<Card> tempCards = new LinkedList<>(cards);
		
		cards.clear();
		
		while(!tempCards.isEmpty()) {
			int pos = random.nextInt(tempCards.size());
			cards.add(tempCards.remove(pos));
		}
	}
	
	


	
	}
	
	

