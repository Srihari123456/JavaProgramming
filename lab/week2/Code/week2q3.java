import java.util.*;

public class week2q3 {
	private int pid;
	private float quantity;
	private float retailPrice;
	private float TotCost;
	
	public week2q3(int id,float price) {
		pid = id;
		quantity = 0;
		retailPrice = price;
		TotCost = 0;
			
	}
	
	public float getTotPrice() {
		TotCost = quantity*retailPrice;
		return TotCost;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dear user, please enter the number of products");
		int n = sc.nextInt();
		week2q3[] product = new week2q3[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the pid and retail price of the products");
			
			int a = sc.nextInt();
			float b = sc.nextFloat();
			product[i] = new week2q3(a,b);
		}
		
		System.out.println("Time to account for the shipping");
		//System.out.println("Enter the pid and quantity sold\nEnter 0 to stop");
		
		int id;
		float q,cost=0;
		System.out.println("Enter 1 to find the total retail price for specific product");
		System.out.println("Enter 2 to enter quantity sold for a specific product");
		System.out.println("Enter 0 to find the total retail prices of all the products sold");
		id = sc.nextInt();
		
		while(id != 0) {
			switch(id) {
			case 1: System.out.println("Enter the product id");
					id = sc.nextInt();
					int f=0;
					for(int i=0;i<n;i++) {
						if(product[i].pid == id) {
							System.out.println("total retail price for product "+id+" is "+product[i].getTotPrice());
							f=1;
							break;
						}
					}
					if(f == 0)
					System.out.println("Enter a valid id");
					break;
					
			case 2: System.out.println("Enter the product id and its quantity sold");
					id = sc.nextInt();
					int f2=0;
					for(int i=0;i<n;i++) {
						if(product[i].pid == id) {
							q = sc.nextFloat();
							product[i].quantity += q;
							product[i].TotCost = product[i].quantity*product[i].retailPrice;
							f2=1;
							break;
						}
					}
					if(f2 == 0)
					System.out.println("Enter a valid id");
					break;
			default: System.out.println("Enter a valid option");
			}
			System.out.println("Enter 1 to find the total retail price for specific product");
			System.out.println("Enter 2 to enter quantity sold for a specific product");
			System.out.println("Enter 0 to find the total retail prices of all the products sold");
			id = sc.nextInt();
		}
		System.out.println("Calculating final results");
		for(int i=0;i<n;i++) {
			cost += product[i].getTotPrice();
		}
		System.out.println("The total retail cost of all the products ="+cost);
	}

}
