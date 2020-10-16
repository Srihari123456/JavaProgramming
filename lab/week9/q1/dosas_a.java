import java.lang.Thread; 
import java.util.*;

class Plate{
	StringBuffer buffer;
}

class Mother extends Thread { 

	boolean dp = false; 
	Plate q;
	Mother(int size, Plate q){ 
		this.q = q;
		this.q.buffer = new StringBuffer(size); 
	} 

	public void run() { 
		synchronized(this.q.buffer){ 
			for (int i = 0; i < q.buffer.capacity(); i++) { 
				try { 
					q.buffer.append(i); 
					System.out.println("Mother has prepared dosa -" + i); 
				} 
				catch (Exception e) { 
					e.printStackTrace(); 
				} 
			} 
			System.out.println("All dosas prepared"); 
			q.buffer.notify(); 
		} 
	} 
} 

class Child extends Thread { 
	Plate q;
	Child(Plate q){ 
		this.q = q; 
	} 

	public void run(){ 

		synchronized (this.q.buffer){ 
			try { 
				q.buffer.wait(); 
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
			} 

			for (int i = 0; i < q.buffer.capacity(); i++) { 
				System.out.println("Child has tracked dosa -"+q.buffer.charAt(i) +
				 " being ready....Total dosas ready in the plate is "+(i+1)); 
			} 
			System.out.println("Child has tracked that all the dosas are ready"); 
		} 
	} 
} 


class dosas_a { 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum count of dosas mother is planning to make"); 	

		Plate q = new Plate();
		Mother p = new Mother(sc.nextInt(),q); 
		Child c = new Child(q);
 
		Thread t1 = new Thread(p); 
		Thread t2 = new Thread(c); 

		t2.start(); 
		t1.start(); 
	} 
} 
