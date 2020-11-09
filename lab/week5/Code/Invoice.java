package lab4;
import java.util.*;
public class Invoice implements TaxCalculator {
	private String partNo;
	private String description;
	private int quantity;
	private double price;
	static double discountRate;
	
	Date d;
	
	
	Invoice(){
		quantity = 0;
		price = 0.0;
		d = new Date();
	}
	Invoice(String partNo, String desc, double price){
		this.partNo = partNo;
		description = desc;
		this.price = price;
		d = new Date();
	}
	Invoice(String partNo, String desc, double price, int quantity){
		this.partNo = partNo;
		description = desc;
		this.price = price;
		this.quantity = quantity;
		d = new Date();
	}
	
	public double calculateTax() {
		return salestaxrate * this.displayTotal();
	}
	
	public static void modifyDiscountRate(double newVal) {
		discountRate = newVal;
	}
	public static double calculateDiscount(double invoiceAmount) {
		return discountRate*invoiceAmount;
	}
	
	public static void displayTotal(Invoice[] arr) {
		int c=0;
		for(Invoice x:arr) {
			System.out.println(++c + " "+x.getInvoiceAmount()+" "+
		x.d);
		}
	}
	
	
	
	
	public double displayTotal() {
		return getInvoiceAmount() - calculateDiscount(getInvoiceAmount());
	}
	public double getInvoiceAmount() {
		return quantity*price;
	}
	
	
	public String getDesc() {
		return description;
	}
	public String getPartNo() {
		return partNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setDesc(String description) {
		this.description = description;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the partNo:");
		this.setPartNo(sc.nextLine());
		System.out.println("Enter the description:");
		this.setDesc(sc.nextLine());
		System.out.println("Enter the Quantity:");
		this.setQuantity(sc.nextInt());
		System.out.println("Enter the price:");
		this.setPrice(sc.nextDouble());
	}
	public void displayDetails(String header) {
		System.out.println(header);
		System.out.println("PartNo: "+this.getPartNo());
		System.out.println("Description: "+this.getDesc());
		System.out.println("Quantity: "+this.getQuantity());
		System.out.println("Price: "+this.getPrice());
		System.out.println("InvoiceAmount: "+this.getInvoiceAmount());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
