package exercise03;

import java.util.Scanner;

public class RetailItemDemo1 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			RetailItem item1 = new RetailItem("Designer Jeans", -1, 34.95);
			System.out.println("Item #2");
			System.out.println("Description: " + item1.getDescription());
			System.out.println("Units on hand: " + item1.getUnitsOnHand());
			System.out.println("Price: " + item1.getPrice());
		} catch (InvalidUnits u) {
			System.out.println(u.getMessage());
		} catch (InvalidPrice p) {
			System.out.println(p.getMessage());
		}
		
		System.out.println("==============================================");
		
		try {
			RetailItem item2= new RetailItem("Designer Jeans", -12, 34.95);
			System.out.println("Item #2");
			System.out.println("Description: " + item2.getDescription());
			System.out.println("Units on hand: " + item2.getUnitsOnHand());
			System.out.println("Price: " + item2.getPrice());
		} catch (InvalidUnits u) {
			System.out.println(u.getMessage());
		} catch (InvalidPrice p) {
			System.out.println(p.getMessage());
		}
		
		System.out.println("==============================================");
		
		try {
			RetailItem item3 = new RetailItem();
			System.out.println("Item #3");
			item3.setDescription("Shirt");
			item3.setUnitsOnHand(10);
			item3.setPrice(25.0);
			System.out.println("Description: " + item3.getDescription());
			System.out.println("Units on hand: " + item3.getUnitsOnHand());
			System.out.println("Price: " + item3.getPrice());
		} catch (InvalidUnits u) {
			System.out.println(u.getMessage());
		} catch (InvalidPrice p) {
			System.out.println(p.getMessage());
		}
		
	}
}
