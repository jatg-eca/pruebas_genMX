package classes.review;

public class NumberHolder {
	

		public int anInt;
	    public float aFloat;
	    
	    public NumberHolder(){
	    	this.aFloat = 1.01F;
	    	this.anInt = 1;
	    }
	    
	    public static void main(String[] arr) {
			int number = new NumberHolder().anInt;
			float floater = new NumberHolder().aFloat;
			
			System.out.println("Number: " + number
					 + " \t Float : " + floater);
		}



}
