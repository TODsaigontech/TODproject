package exercise03;

public class InvalidPrice extends Exception {
	
	public InvalidPrice() {
		super("Price cannot be negative ");
	}
	
	public InvalidPrice(double n) {
		super(n+" is invalid. Price should be larger than 0");
	}
}
