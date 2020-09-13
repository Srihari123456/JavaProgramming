import java.util.*;
public class week3q4 {
	private double distance,hours,minutes,seconds;
	private double speed;
	public double getSpeed() {
		seconds += minutes*60;
		seconds += hours*60*60;
		speed = distance/seconds;
		return speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		week3q4 obj1 = new week3q4();
		System.out.print("Enter the distance covered");
		obj1.distance = sc.nextDouble();
		System.out.println("Enter the time taken as hh mm ss");
		obj1.hours = sc.nextDouble();
		obj1.minutes = sc.nextDouble();
		obj1.seconds = sc.nextDouble();
		
		System.out.println("Speed(m/s)  = "+obj1.getSpeed());
		System.out.println("Speed(km/h)  = "+obj1.getSpeed()*(18/5.0));
		System.out.println("Speed(miles/h)  = "+obj1.getSpeed()*(2.2369));
	}
}
