package lab5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
	public void writeIntoFile(java.io.File outfile,boolean exists) throws IOException{
		//PrintWriter output = new PrintWriter(outfile);
		FileOutputStream output = new FileOutputStream(outfile,exists);
		String s = "Displaying the details of a cricketer\n";
		byte b[] = s.getBytes();
		output.write(b);
		s = this.toString();
		b = s.getBytes();
		output.write(b);
		output.close();
		
	}
	
	@Override
	public String toString() {
		String res = "";
		res += " Name: "+this.getName();
		res += "\n Age: "+this.getAge();
		res += "\n Height: "+this.getHeight();
		res += "\n Weight: "+this.getWeight();
		res += "\n Country: "+this.getCountry();
		res += "\n Role: "+this.getRole();
		res += "\n Wickets: "+this.getWickets();
		res += "\n Runs: "+this.getRuns();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
