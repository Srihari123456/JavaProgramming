package lab5;
import java.util.*;
public class Testerlevel3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of players");
		int n = sc.nextInt();
		Person arr[] = new Person[n];
		char x;
		for(int i=0;i<n;i++) {
			System.out.println("Enter c for cricketers any other char for footballers");
			System.out.println("Then Enter their name,age,height and weight");
			x = sc.next().charAt(0);
			if(x == 'c') {
				arr[i] = new Cricketer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			}
			else {
				arr[i] = new FootballPlayer(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			}
		}
		ArrayList<FootballPlayer>fp = new ArrayList<FootballPlayer>();
		for(Person a:arr) {
			System.out.print(a.getName()+" is a");
			if(a instanceof Cricketer) {
				System.out.println(" cricketer");
			}
			else if(a instanceof FootballPlayer) {
				System.out.println(" football player\nEnter the goals he scored");
				FootballPlayer obj = (FootballPlayer)a;
				obj.setGoals(sc.nextInt());
				fp.add(obj);
			}
		}
		Collections.sort(fp);
		System.out.println("Displaying the football players in the order of the goals scored");
		for(FootballPlayer f: fp) {
			System.out.println(f.getName() +" scored "+f.getNoOfGoals()+" goals");
		}
	}
}
