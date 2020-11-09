import java.util.*;
class Plate{
	int n;	boolean valueSet = false;
	synchronized int get(){
		while(!valueSet)
			try{	wait();
			} catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		System.out.println(" and Dosa: "+n+" has been tracked by the child");
		valueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n){
		while(valueSet)
			try{	wait();
			} catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.print("Dosa: "+n+" is made ready by the mother");
		notify();
	}
}
class Mother implements Runnable{
	Plate q;
	Thread t;
	int dosa_count;
	Mother(Plate q,int size){
		this.q = q;
		t = new Thread(this,"Mother");
		dosa_count = size;
	}
	public void run(){
		int i = 0;
		while(true && i<dosa_count){
			q.put(i++);
		}
	}
}

class Child implements Runnable{
	Plate q;
	Thread t;

	Child(Plate q){
		this.q = q;
		t = new Thread(this,"Child");
	}
	
	public void run(){
		while(true){
			q.get();
		}
	}
}


class dosas_b{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum count"
		+" of dosas mother is planning to make"); 	
		int size = sc.nextInt();
		Plate q = new Plate();
		Mother p = new Mother(q,size);
		Child c = new Child(q);

		p.t.start();
		c.t.start();
		System.out.println("Ctrl+c to stop");
	}
}
