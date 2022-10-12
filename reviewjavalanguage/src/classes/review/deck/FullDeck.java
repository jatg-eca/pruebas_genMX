package classes.review.deck;

public class FullDeck {
	
	private String material;
	private String coverArt;
	private Card abastos;
	private Card aoros;
	private Card acopas;
	private Card aespadas;
	/*And so on*/
	
	private static final int CARDS_DECK_NUMBER = 52;
	
	
	public FullDeck() {
		abastos = new Card("A", "bastos", "negro");
		aoros = new Card("A", "oros", "rojo");
		acopas = new Card("A", "copas", "rojo");
		aespadas = new Card("A", "espadas", "negro");
		/*And so on*/
		this.material = "papel";
		this.coverArt = "rombos rojos";
	}
	
	public void personalizeCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}
	
	public void personalizeMaterial(String material) {
		this.material = material;
	}
	
	public void getAces() {
		this.abastos.getCard();
		this.acopas.getCard();
		this.aespadas.getCard();
		this.aoros.getCard();
	}

	
	

}
