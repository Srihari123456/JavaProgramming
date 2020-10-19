package lab9;
import labexam.TeachingFaculty;
import java.util.*;

public class Q1 {

	static <T> void isEqualTo(T obj1,T obj2) 
	{
		System.out.println(obj1.equals(obj2));	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 decimal numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		System.out.println("Are these equal?");
		isEqualTo(a,b);
		
		
		System.out.println("Enter the department name and the faculty name of the teaching faculty 1");
		TeachingFaculty obj1 = new TeachingFaculty(sc.next(),sc.next());
		
		System.out.println("Enter the department name and the faculty name of the teaching faculty 2");
		TeachingFaculty obj2 = new TeachingFaculty(sc.next(),sc.next());
		
		System.out.println("Are these equal?");
		isEqualTo(obj1,obj2);
		obj2 = obj1;
		System.out.println("Now assigned obj2 = obj1....Are these equal?");
		isEqualTo(obj1,obj2);
	}

}