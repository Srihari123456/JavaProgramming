package lab6;
import java.util.*;
public class TimeTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		while(true) {
		try {
			System.out.println("Enter the hours:");
			t1.setHour(sc.nextInt());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please enter the value >=0");
			System.out.println("Re-enter the time");
			continue;
		}
		try {
			System.out.println("Enter the minutes:");
			t1.setMinute(sc.nextInt());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please enter the value >=0 and <60");
			System.out.println("Re-enter the time");
			continue;
		}
		try {
			System.out.println("Enter the seconds:");
			t1.setSecond(sc.nextInt());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please enter the value >=0 and <60");
			System.out.println("Re-enter the time");
			continue;
		}
		System.out.println("The time is "+t1.toString());
		break;
		}
	}

}
