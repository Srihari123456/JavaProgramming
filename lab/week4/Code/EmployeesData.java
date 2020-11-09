import java.util.*;
public class EmployeesData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees : ");
        int employees = sc.nextInt();
        ArrayList<Integer> totalWorking = new ArrayList<Integer>();

        System.out.println("Enter work hours of employees for 7 days: ");
        int Work[][]=new int[employees][8];
        for(int i=0; i<employees;i++){
        	System.out.println("Employee "+i);
            for(int j=0; j<7;j++)
            {
                Work[i][j]=sc.nextInt();
                Work[i][7] += Work[i][j];
            }
        }
        for(int i =0 ;i<employees;i++){
        	totalWorking.add(Work[i][7]);
        }
        System.out.println("Work hours of employees in descending order: ");
        for(int i = 0;i<employees;i++){
            int highest = Collections.max(totalWorking);
            int index = totalWorking.indexOf(highest);
            System.out.println("Employee "+index+" : "+highest+"hrs");
            totalWorking.set(index,-1);
        }
	}

}
