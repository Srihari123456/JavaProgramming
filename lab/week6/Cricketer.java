package lab5;
import java.util.*;
public class Cricketer extends Person{
	private String country;
	private String role;
	private int wickets;
	private int runs;
	public Cricketer() { }
	public Cricketer(String name, int age ,double height, double weight) {
		super(name,age,height,weight);
	}
	public String getCountry() { return country; }
	public int getRuns() { return runs; }
	public int getWickets() { return wickets; }
	public String getRole() { return role; }
	public Cricketer(String name, int age ,double height, double weight,String teamName,String role,int wickets,int runs) {
		super(name,age,height,weight);
		this.country = teamName;
		this.role = role;
		this.wickets = wickets;
		this.runs = runs;
	}
	@Override
	public String toString() {
		String res = "";
		res += "Name: "+this.getName();
		res += "\nAge: "+this.getAge();
		res += "\nHeight: "+this.getHeight();
		res += "\nWeight: "+this.getWeight();
		res += "\nCountry: "+this.getCountry();
		res += "\nRole: "+this.getRole();
		res += "\nWickets: "+this.getWickets();
		res += "\nRuns: "+this.getRuns();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
