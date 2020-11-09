package lab5;
import java.util.*;
public class TestPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name,age,height,weight,team,UniformID,goals scored by a football player");
		FootballPlayer obj1 = new
				FootballPlayer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt());
		System.out.println("The no of goals scored by this foolball player is "+obj1.getNoOfGoals());
		
		
		
		System.out.println("Enter the name,age,height,weight,team,role,wickets,runs of a cricketer");
		Cricketer obj2 = new 
				Cricketer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
		
		
		System.out.println("Displaying the details of a foolball player\n"+obj1.toString());
		
		System.out.println("Displaying the details of a cricketer\n"+obj2.toString());
		
		
		
		
	}

}
