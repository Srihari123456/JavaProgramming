import java.util.*;
public class week3q1 {
	private int num;
	private int days;
	week3q1(int num){
		this.num = num;
	}
	int getNodays() {
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: return 31;
		case 2: return 28;
		default: return 30;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number to find the number of days in it");
		int num = sc.nextInt();
		week3q1 obj1 = new week3q1(num);
		System.out.println("The number of days in the given month is "+obj1.getNodays());
		
	}

}
