package lab4;
import java.util.*;

public class InvoiceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of objects");
		int n = sc.nextInt();
		Invoice []obj = new Invoice[n];
		
		String part,des;
		double cost;
		int quant;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the following details ");
			System.out.println("Enter the partNo:");
			part = sc.next();
			System.out.println("Enter the description:");
			des = sc.next();
			System.out.println("Enter the price:");
			cost = sc.nextDouble();
			System.out.println("Enter the quantity:");
			quant = sc.nextInt();
			obj[i] = new Invoice(part,des,cost,quant);
			System.out.println("Enter the time in millisecond to register purchase"
					+ " date after 1st jan 1970!");
			obj[i].d.setTime(sc.nextInt());
			//obj[i].displayDetails("hi");
			//System.out.println(obj[i].d);
		}
		
		Invoice.displayTotal(obj);
		
	}

}
