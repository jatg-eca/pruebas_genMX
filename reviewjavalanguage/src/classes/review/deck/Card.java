package classes.review.deck;

public class Card {
	
	private String rank;
	private String suit;
	private String color;
	
	
	public Card(String rank, String suit, String color) {
		this.rank = rank;
		this.suit = suit;
		this.color = color;
	}
	
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		this.color = "blanco";
	}
	
	public void getCard() {
		System.out.println("Una carta de características " + "\"" +
							rank + "\" de " + suit + " " + color );
	}

}
