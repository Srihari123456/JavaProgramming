package lab4;
import java.util.*;
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Time obj1 = new Time();
		System.out.println("Enter the following details for obj1");
		obj1.getDetails();
		obj1.displayDetails("******Object1********");
/*		System.out.println("Enter the elapsed time in seconds:");
		obj1.timeElapsed(sc.nextInt());
*/		obj1.displayDetails("******Object1********");
		
		int hours,minutes,seconds;
		System.out.println("Enter the following details for obj2");
		System.out.println("Enter the hours:");
		hours = sc.nextInt();
		System.out.println("Enter the minutes:");
		minutes = sc.nextInt();
		System.out.println("Enter the seconds:");
		seconds = sc.nextInt();
		
		
		Time obj2 = new Time(hours,minutes,seconds);
		obj2.displayDetails("******Object2********");
/*		System.out.println("Enter the elapsed time in seconds:");
		obj2.timeElapsed(sc.nextInt());
*/		obj2.displayDetails("******Object2********");
		
		System.out.println("Is object1's time >,"
				+ "< or equal to object2's time? "+obj1.equals(obj2));
		System.out.println("Displaying Object1's time "+obj1.toString());
		System.out.println("Displaying Object1's"
				+ " time in 12hr format "+obj1.display(0));
		System.out.println("Displaying Object1's "
				+ "time in 24hr format "+obj1.display(1));
		
		
		Time obj3 = obj1.addtime(obj1,obj2);
		System.out.println("Adding time of object1 and object2, we get object 3");
		obj3.displayDetails("******Object3********");
		
		
		
	}

}
