import java.util.*;
public class week2q5 {
	private int java;
	private int chash;
	private int c;
	private int cpp;
	private int python;
	private float average;
	
	public float getAvg() {
		return (java+chash+c+cpp+python)/5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week2q5 a = new week2q5();
		a.java = Integer.parseInt(args[0]);
		a.chash =  Integer.parseInt(args[1]);
		a.c =  Integer.parseInt(args[2]);
		a.cpp =  Integer.parseInt(args[3]);
		a.python =  Integer.parseInt(args[4]);
		
		System.out.println("Average score obtained = "+a.getAvg());
	}

}
