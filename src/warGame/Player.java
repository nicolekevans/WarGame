package warGame;

import java.util.LinkedList;
import java.util.List;

public class Player {

	private String name;
	private List<Card> hand = new LinkedList<>();
	private int score;
	
	public Player(String name) {
		this.name = name;
		
	}
	
	public String toString() {
		return getName();
		
	}
	
	public String getName() {
		return name;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.getCards().remove(0));
	}

	public List<Card> getHand() {
		
		return hand;
	}

	public Card flip() {
		// TODO Auto-generated method stub
		return hand.remove(0);
	}

	public void incrementScore() {
		// TODO Auto-generated method stub
		score += 1;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	
	
	
	
}
