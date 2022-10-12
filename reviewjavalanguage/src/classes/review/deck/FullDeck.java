package classes.review.deck;

public class FullDeck {
	
	private String material;
	private String coverArt;
	
	private Card abastos;
	private Card aoros;
	private Card acopas;
	private Card aespadas;
	
	private Card $1bastos;
	private Card $1oros;
	private Card $1copas;
	private Card $1espadas;
	
	private Card $2bastos;
	private Card $2oros;
	private Card $2copas;
	private Card $2espadas;
	
	private Card $3bastos;
	private Card $3oros;
	private Card $3copas;
	private Card $3espadas;
	
	private Card $4bastos;
	private Card $4oros;
	private Card $4copas;
	private Card $4espadas;
	
	private Card $5bastos;
	private Card $5oros;
	private Card $5copas;
	private Card $5espadas;
	
	private Card $6bastos;
	private Card $6oros;
	private Card $6copas;
	private Card $6espadas;
	
	private Card $7bastos;
	private Card $7oros;
	private Card $7copas;
	private Card $7espadas;
	
	private Card $8bastos;
	private Card $8oros;
	private Card $8copas;
	private Card $8espadas;
	
	private Card $9bastos;
	private Card $9oros;
	private Card $9copas;
	private Card $9espadas;
	
	private Card $10bastos;
	private Card $10oros;
	private Card $10copas;
	private Card $10espadas;
	
	private Card $Jbastos;
	private Card $Joros;
	private Card $Jcopas;
	private Card $Jespadas;
	
	private Card $Qbastos;
	private Card $Qoros;
	private Card $Qcopas;
	private Card $Qespadas;
	
	private Card $Kbastos;
	private Card $Koros;
	private Card $Kcopas;
	private Card $Kespadas;
	
	
	/*And so on*/
	
	private static final int CARDS_DECK_NUMBER = 52;
	
	
	public FullDeck() {
		abastos = new Card("A", "bastos", "negro");
		aoros = new Card("A", "oros", "rojo");
		acopas = new Card("A", "copas", "rojo");
		aespadas = new Card("A", "espadas", "negro");
		/*And so on*/
		
		$1bastos = new Card("1", "bastos");
		$1oros = new Card("1", "oros");
		$1copas = new Card("1", "copas");
		$1espadas = new Card("1", "espadas");
		
		$2bastos = new Card("2", "bastos");
		$2oros = new Card("2", "oros");
		$2copas = new Card("2", "copas");
		$2espadas = new Card("2", "espadas");
		
		$3bastos = new Card("3", "bastos");
		$3oros = new Card("3", "oros");
		$3copas = new Card("3", "copas");
		$3espadas = new Card("3", "espadas");
		
		$4bastos = new Card("4", "bastos");
		$4oros = new Card("4", "oros");
		$4copas = new Card("4", "copas");
		$4espadas = new Card("4", "espadas");
		
		$5bastos = new Card("5", "bastos");
		$5oros = new Card("5", "oros");
		$5copas = new Card("5", "copas");
		$5espadas = new Card("5", "espadas");
		
		$6bastos = new Card("6", "bastos");
		$6oros = new Card("6", "oros");
		$6copas = new Card("6", "copas");
		$6espadas = new Card("6", "espadas");
		
		$7bastos = new Card("7", "bastos");
		$7oros = new Card("7", "oros");
		$7copas = new Card("7", "copas");
		$7espadas = new Card("7", "espadas");
		
		$8bastos = new Card("8", "bastos");
		$8oros = new Card("8", "oros");
		$8copas = new Card("8", "copas");
		$8espadas = new Card("8", "espadas");
		
		$9bastos = new Card("9", "bastos");
		$9oros = new Card("9", "oros");
		$9copas = new Card("9", "copas");
		$9espadas = new Card("9", "espadas");
		
		$10bastos = new Card("10", "bastos");
		$10oros = new Card("10", "oros");
		$10copas = new Card("10", "copas");
		$10espadas = new Card("10", "espadas");
		
		$Jbastos = new Card("J", "bastos");
		$Joros = new Card("J", "oros");
		$Jcopas = new Card("J", "copas");
		$Jespadas = new Card("J", "espadas");
		
		$Qbastos = new Card("Q", "bastos");
		$Qoros = new Card("Q", "oros");
		$Qcopas = new Card("Q", "copas");
		$Qespadas = new Card("Q", "espadas");
		
		$Kbastos = new Card("K", "bastos");
		$Koros = new Card("K", "oros");
		$Kcopas = new Card("K", "copas");
		$Kespadas = new Card("K", "espadas");
		
		this.material = "papel";
		this.coverArt = "rombos rojos";
	}
	
	public void fulldeckCardCreator() {
		
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
