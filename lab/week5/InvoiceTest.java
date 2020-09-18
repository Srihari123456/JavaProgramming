package lab4;
import java.util.*;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Invoice obj1 = new Invoice();
		System.out.println("For any object, the default values"
				+ " for quantity is "+obj1.getQuantity()+" and price "
				+obj1.getPrice());
		System.out.println("Enter the following details for obj1");
		obj1.getDetails();
		obj1.displayDetails("*****OBJECT-1******");
	
		System.out.println("Enter the discount rate");
		Invoice.discountRate = sc.nextDouble();
		
		System.out.println("The payable amount of obj1 "
				+ "including discount is "+obj1.displayTotal());
		
		double tax = obj1.calculateTax();
		System.out.println("You need to pay "+tax+" as tax");
/*			
		String part,des;
		double cost;
		int quant;
		
		System.out.println("Enter the following details for obj2");
		System.out.println("Enter the partNo:");
		part = sc.nextLine();
		System.out.println("Enter the description:");
		des = sc.nextLine();
		System.out.println("Enter the price:");
		cost = sc.nextDouble();
		Invoice obj2 = new Invoice(part,des,cost);
		
		obj2.displayDetails("*****OBJECT-2******");
		System.out.println("Enter the quantity for obj2");
		int quan = sc.nextInt();
		obj2.setQuantity(quan);
		obj2.displayDetails("*****OBJECT-2******");
		
		System.out.println("Enter the following details for obj3");
		System.out.println("Enter the partNo:");
		part = sc.next();
		System.out.println("Enter the description:");
		des = sc.next();
		System.out.println("Enter the price:");
		cost = sc.nextDouble();
		System.out.println("Enter the quantity");
		quant = sc.nextInt();
		Invoice obj3 = new Invoice(part,des,cost,quant);		
		obj3.displayDetails("*****OBJECT-3******");
		*/
	}

}
