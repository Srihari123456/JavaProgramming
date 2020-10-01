package lab6;
import java.util.*;
public class InvoiceTest {
	static Scanner sc = new Scanner(System.in);
	
	private static int initPartNo() {
		int no;
		while(true) {
			try {
				System.out.println("Enter the part number");
				no = sc.nextInt();
				if(no <= 0) {
					throw new CustomException("Part number not found ");
				}
				else if(no <= 0)
					throw new InputMismatchException();
				else
					return no;
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid integer partNo.");
				sc.nextLine();
			}
			catch(CustomException e) {
				System.out.println("Error: "+e.getMessage());
			}
		}
	}
	private static int initQuantity() {
		int qty;
		while(true) {
			try {
				System.out.println("Enter the quantity");
				qty = sc.nextInt();
				if(qty <= 0)
					throw new InputMismatchException();
				else
					return qty;
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid quantity");
				sc.nextLine();
			}
		}
	}	
	private static String initDescription() {
		String des=null;
		while(true) {
			try {
				System.out.println("Enter the description");
				 sc.nextLine();
				des = sc.nextLine();
				if(des.equals(""))
					throw new InputMismatchException();
				else 
					return des;
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid description");
				//sc.nextLine();
			}
		}
	}
	private static double initPrice() {
		double price;
		while(true) {
			try {
				System.out.println("Enter the cost");
				price = sc.nextDouble();
				if(price <= 0)
					throw new InputMismatchException();
				else
					return price;
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid cost");
				sc.nextLine();
			}
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int partNo,qty;
		String desc;
		double cost;
		
		//System.out.println("Enter the partNo:");
		partNo = initPartNo();
		
		//System.out.println("Enter the description:");
		desc = initDescription();
		
		//System.out.println("Enter the Quantity:");
		qty = initQuantity();
		
		//System.out.println("Enter the price:");
		cost = initPrice();
		
		
		Invoice obj1 = new Invoice(partNo,desc,cost,qty);
		obj1.displayDetails("Object Created");
		Invoice arr[] = new Invoice[2];
		for(int i=0;i<5;i++) {
			try {
				arr[i] = new Invoice(partNo,desc,cost,qty);
				System.out.println(arr[i].toString());
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Accesssing an element out of"
						+ " the created array\nPlease try again");
				break;
			}
		}
	}

}
