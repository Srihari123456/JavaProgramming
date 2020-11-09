import java.util.*;

public class ShippingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of your order");
        int weight = sc.nextInt();
        int total = 0;
        while(weight > 0) {
        	if(weight<=10) {
        		total+=3;
        	}
        	else {
        		total+=3 + weight-10;
        	}
        	System.out.println("It costs you "+total);
        	total=0;
        	System.out.println("Enter weight of your order");
        	weight = sc.nextInt();
        }
        System.out.println("Calculations Done!");
	}

}
