package lab5;
import java.util.*;
public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the time in hours,minutes and seconds"
				+ " for 24hour format representation");
		TwentyFrHrClock obj1 = new TwentyFrHrClock(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Calling the method from interface - StopWatch");
		obj1.StartTimer();
/*		
		System.out.println("Invoking the display method for 24hour format representation");
		obj1.display();
		
		System.out.println("Enter the elapsed time in seconds:");
		obj1.timeElapsed(sc.nextInt());
		
		System.out.println("Invoking the display method for 24hour format representation");
		obj1.display();
		
		System.out.println("enter the time in hours,minutes, seconds"
				+ " for 12hour format representation");
		TwelveHrClock obj2 = new TwelveHrClock(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		
		
		System.out.println("Invoking the display method for 12hour format representation");
		obj2.display();
		
		System.out.println("enter the time in hours,minutes and seconds"
				+ " for another object in 12hour format representation");
		TwelveHrClock obj3 = new TwelveHrClock(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Invoking the display method for 12hour format representation");
		obj3.display();
		
		System.out.println("The time difference between these two objects is "+
		obj2.difference(obj3)+" seconds");
*/		
		
	}
}
