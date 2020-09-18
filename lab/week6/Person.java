package lab5;
import java.util.*;
public abstract class Person {

	protected String name;
	protected int age;
	protected double height;
	protected double weight;
	
	protected Person() {
		
	}
	protected Person(String name, int age ,double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	
	
	public String toString() {
		String res = "";
		res += "Name: "+name;
		res += "\nAge: "+age;
		res += "\nHeight: "+height;
		res += "\nWeight: "+weight;
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
