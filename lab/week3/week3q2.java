import java.util.*;
public class week3q2 {
	private char alph;
	week3q2(char x){
		this.alph = x;
	}
	public String VowelCons() {
		if((alph>='a' && alph<='z' || alph>='A' && alph<='Z' ) == false) {
			return "Invalid input";
		}
		
		if(alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u')return "Vowel";
		return "Consonant";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.nextLine();
		if(alphabet.length() > 1) {
			System.out.println("Invalid input");
			return;
		}
		week3q2 obj1 = new week3q2(alphabet.toLowerCase().toCharArray()[0]);
		System.out.println("The given character "+alphabet.toCharArray()[0]+" is a "+obj1.VowelCons());
	}

}
