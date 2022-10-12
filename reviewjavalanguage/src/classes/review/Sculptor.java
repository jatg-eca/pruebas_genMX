package classes.review;

public class Sculptor extends Artist{
	private String sculptingMaterial;
	
	public Sculptor(String primerPincel, boolean hasBoina, boolean isMamador) {
		super(primerPincel, hasBoina, isMamador);
		// TODO Auto-generated constructor stub
	}
	public Sculptor(String primerPincel, boolean hasBoina, boolean isMamador, String sculptingMaterial) {
		super(primerPincel, hasBoina, isMamador);
		// TODO Auto-generated constructor stub
		this.sculptingMaterial = sculptingMaterial;
	}
	
	public Sculptor returnArtist() {
		System.out.println("Override");
		return this;
	}
	

	
	

}
