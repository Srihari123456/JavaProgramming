package lab7;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import lab5.Cricketer;
import lab5.FootballPlayer;
public class TestPerson {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File outfile = new File("PersonOutputs.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name,age,height,weight,team,UniformID,goals scored by a football player");
		FootballPlayer obj1 = new
				FootballPlayer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt());
		obj1.writeIntoFile(outfile,outfile.exists());
		System.out.println("Enter the name,age,height,weight,team,role,wickets,runs of a cricketer");
		Cricketer obj2 = new Cricketer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
		obj2.writeIntoFile(outfile,outfile.exists());
		sc.close();
	}
}