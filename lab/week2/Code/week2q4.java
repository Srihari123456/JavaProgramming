import java.util.*;
public class week2q4 {
	private int score;
	private char grade;
	public boolean checkScore() {
		if(score <= 0) {
			System.out.println("Enter a valid score!");
			return true;
		}
		return false;
	}
	
	public char getScore(){
		if(score>=90) grade = 'A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade='E';
		
		return grade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		week2q4 a = new week2q4();
		System.out.println("Enter your score");
		a.score = sc.nextInt();
		if(a.checkScore())return;
		System.out.println("A's grade is "+a.getScore());
		
	}

}
