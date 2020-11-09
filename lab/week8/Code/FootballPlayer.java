package lab5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class FootballPlayer extends Person implements Comparable<FootballPlayer>{
	private String teamName;
	private int UniformNo;
	private int NoOfGoals;
	public FootballPlayer() {	}
	public FootballPlayer(String name, int age ,double height, double weight) {
		super(name,age,height,weight);
	}
	public FootballPlayer(String name, int age ,double height, double weight,String teamName,int UniformNo,int NoOfGoals) {
		super(name,age,height,weight);
		this.teamName = teamName;
		this.UniformNo = UniformNo;
		this.NoOfGoals = NoOfGoals;
	}
	public int compareTo(FootballPlayer f) {
		return this.NoOfGoals - f.NoOfGoals;
	}
	
	public void setGoals(int g) {this.NoOfGoals = g;}
	public int getNoOfGoals() { return NoOfGoals; }
	public String getTeamName() { return teamName; }
	public int getUniformNo() { return UniformNo; }
	
	public void writeIntoFile(java.io.File outfile,boolean exists) throws IOException{
		FileOutputStream output = new FileOutputStream(outfile,exists);
		String s = "The no of goals scored by this football player is "+this.getNoOfGoals();
		byte b[] = s.getBytes();
		output.write(b);
		s = "\nDisplaying the details of a foolball player\n"+this.toString();
		b = s.getBytes();
		output.write(b);
		output.close();

	}
	@Override
	public String toString() {
		String res = "";
		res += "Name: "+this.getName();
		res += "\nAge: "+this.getAge();
		res += "\nHeight: "+this.getHeight();
		res += "\nWeight: "+this.getWeight();
		res += "\nTeam: "+this.getTeamName();
		res += "\nUniformNo: "+this.getUniformNo();
		res += "\nGoals: "+this.getNoOfGoals();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
