import java.util.*;
public class StudentRoll {
	private ArrayList<String> students= new ArrayList<String>();;
	private String name;
	StudentRoll(){
	//	ArrayList<String>students = new ArrayList<String>();	
	}
	public boolean checkName(String name) {
		//if(students.contains(name))return true;
		for(String x:students) {
			if(x.equals(name))return true;
		}
		return false;
	}
	public void addName(String name) {
		students.add(name);
		System.out.println("Name added");
	}
	public int getIndex(String name) {
		//return students.indexOf(name);
		int c=0;
		for(String x:students) {
			if(x.equals(name))return c;
			c++;
		}
		return -1;
	}
	public void deleteName(String name) {
		if(!checkName(name)){
            System.out.println("Name does not exist");
            return;
        }
		students.remove(name);
		System.out.println("Name Deleted!");
	}
	public void printList() {
		if(students.size()==0) {
			System.out.println("There are no enrolled students:");
			return;
		}
	
		System.out.println("The following is the list of enrolled students:");
        Collections.reverse(students);
        for(int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
        }
		Collections.reverse(students);
	}
	
	public int getCount() {
		try {
		return students.size();
		}
		catch(Exception NullPointerException){
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentRoll obj1 = new StudentRoll();
		//obj1.students.add("hari");
		while(true){
            System.out.println("Enter 1-add; 2-check; 3- remove; 4-indexof; 5-getList, 6-size");
            System.out.println("Enter the choice:");
            int n = sc.nextInt();
            String name; 
            switch(n){
                case 1:
                    System.out.println("Enter the name:");
                    name = sc.next();
                     if(obj1.checkName(name)) {
                    	System.out.println("Name exists");
                    }
                    else {
                    	obj1.addName(name);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name:");
                    obj1.name = sc.next();
                    if(!obj1.checkName(obj1.name)){
                        System.out.println("Name does not exist");
                    }
                    else{
                     System.out.println("Name exists");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name:");
                    obj1.name = sc.next();
                    obj1.deleteName(obj1.name);
                    break;
                case 4:
                    System.out.println("Enter the name:");
                    obj1.name = sc.next();
                    if(!obj1.checkName(obj1.name)){
                        System.out.println("Name does not exist");
                    }
                    else{
                        System.out.println(obj1.getIndex(obj1.name));
                    }
                    break;
                case 5:
                    obj1.printList();
                    break;
                case 6:
                	System.out.println("There are "+obj1.getCount()+" students in the class");
                    break;
                default:
                    break;
		}
	}

}
}
