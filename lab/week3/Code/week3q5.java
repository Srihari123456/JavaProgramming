import java.util.*;
public class week3q5 {
	private int num1,num2,num3;
	week3q5(int a,int b,int c){
		num1 = a;
		num2 = b;
		num3 = c;
	}
	public String getOrder() {
		if(num1 > num2 && num2 > num3)return "Decreasing";
		if(num1 < num2 && num2 < num3)return "Increasing";
		return "Neither Increasing Nor Decreasing";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		week3q5 obj1 = new week3q5(a,b,c);
		System.out.println(obj1.getOrder());
	}

}
