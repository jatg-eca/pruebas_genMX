package classes.review.deck;

public class FullDeck {
	
	private Card card;
	private String material;
	private String coverArt;
	
	private static final int CARDS_DECK_NUMBER = 52;
	
	public FullDeck() {
		Card abastos = new Card("A", "bastos", "negro");
		Card aoros = new Card("A", "oros", "rojo");
		Card acopas = new Card("A", "copas", "rojo");
		Card aespadas = new Card("A", "espadas", "negro");
		this.material = "papel";
		this.coverArt = "rombos rojos";
	}
	
	public void personalizeCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}
	
	public void personalizeMaterial(String material) {
		this.material = material;
	}
	
	

}
