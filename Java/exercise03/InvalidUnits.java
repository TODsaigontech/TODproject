package exercise03;

public class InvalidUnits extends Exception {
	
	public InvalidUnits() {
		super("Units cannot be negative");
	}
	
	public InvalidUnits(int n) {
	    super(n+" is invalid. Units should be larger than 0");
	}
}
