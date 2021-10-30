package warGame;

import java.util.List;

public class Card {

	private String value;
	private String suit;
	private int rank;
	
	public Card(String value, String suit, int rank) {
		this.value = value;
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {
		return getCardType() + "rank =" + rank;
	}

	private String getCardType() {
		// TODO Auto-generated method stub
		return value + " of " + suit;
	}

	public int getRank() {
		// TODO Auto-generated method stub
		return rank;
	}
	
	public String describe(){
		return value + " of " + suit + " is worth " + rank ;
		
	}
	
		

	
	
	
	}

