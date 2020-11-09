import java.util.*;
public class week2q2 {

	private float distance;
	private float costpl;
	private float kmph;
	private float parking;
	private float tolls;
	private float transportationCost;
	public float getTotalCost() {
		transportationCost += tolls + parking;
		float fuelReqd = distance/kmph;
		transportationCost += fuelReqd*costpl;
		return transportationCost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		week2q2 a = new week2q2();
		System.out.println("Dear User, Please enter the details as required");
		System.out.println("What is the total distance travelled in km a day?");
		a.distance = sc.nextFloat();
		System.out.println("What is the cost of the fuel per litre?");
		a.costpl = sc.nextFloat();
		System.out.println("What is the average km per litre?");
		a.kmph = sc.nextFloat();
		System.out.println("How much do you pay for parking?");
		a.parking = sc.nextFloat();
		System.out.println("How much does the tolls cost?");
		a.tolls = sc.nextFloat();
		System.out.println("Calculating your transportation cost per day....."+a.getTotalCost());
	}
}
