package lab6;
import java.util.*;
public class Invoice {
	static Scanner sc = new Scanner(System.in);
	private int partNo;
	private String description;
	private int quantity;
	private double price;
	
	Invoice(int partNo, String desc, double price, int quantity){
		this.partNo = partNo;
		description = desc;
		this.price = price;
		this.quantity = quantity;
	}
	public String getDesc(){return description;}
	public int getPartNo(){return partNo;}
	public int getQuantity(){return quantity;}
	public double getPrice(){return price;}
	
	public void displayDetails(String header) {
		System.out.println(header);
		System.out.println("PartNo: "+this.getPartNo());
		System.out.println("Description: "+this.getDesc());
		System.out.println("Quantity: "+this.getQuantity());
		System.out.println("Price: "+this.getPrice());
	}
	public String toString() {
		String res="";
		res += "\n\nPartNo: "+this.getPartNo() + "\nDescription: "+this.getDesc()
		+ "\nQuantity: "+this.getQuantity() + "\nPrice: "+this.getPrice();
		return res;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
