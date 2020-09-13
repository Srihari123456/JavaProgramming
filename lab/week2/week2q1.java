import java.util.*;
public class week2q1 {

	public int digits(int n) {
		int c=0;
		while(n != 0) {
			c++;
			n/=10;
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		int n = sc.nextInt();
		week2q1 a = new week2q1();
		if(a.digits(n) != 5) {
			System.out.println("Please Enter a 5 digit number");
			return;
		}
		String res = "";
		while(n != 0) {
			res = (n%10)  + " "+ res;
			n/=10;
		}
		System.out.println("Resultant = "+res);
	}

}
