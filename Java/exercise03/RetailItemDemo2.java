package exercise03;

import java.util.Scanner;

public class RetailItemDemo2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String des;
		int units;
		double price;
		boolean gooodInput;
		int itemCount=1;
		
		do {
			System.out.println("Item #"+itemCount);
			RetailItem item= new RetailItem();
			
			try {
				System.out.print("Enter description: ");
				des=sc.nextLine();
				item.setDescription(des);
				System.out.print("Enter units on hand: ");
				units = sc.nextInt();
				item.setUnitsOnHand(units);
				System.out.print("Enter price: ");
				price = sc.nextDouble();
				item.setPrice(price);
				itemCount++;
				gooodInput=true;
				sc.nextLine();
				System.out.println("===============================");
			} catch (InvalidUnits u) { 
				System.out.println(u.getMessage());
				gooodInput=false;
			} catch (InvalidPrice p) {
				System.out.println(p.getMessage());
				gooodInput=false;
			}
			
		} while (gooodInput);
		
	}
}
