package lab5;
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
