import java.util.*;
public class week3q3 {
	private int num;
	private int digitSum;
	week3q3(int num){
		this.num = num;
		this.digitSum = 0;
	}
	public int getDigitSum() {
		while(num != 0) {
			digitSum += num%10;
			num /= 10;
		}
		return digitSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num <= 0 || num >= 1000) {
			System.out.println("Enter numbers between 0 and 1000");
			return;
		}
		week3q3 obj1 = new week3q3(num);
		System.out.println("Sum of the digits in the given number = "+obj1.getDigitSum());
	}
}