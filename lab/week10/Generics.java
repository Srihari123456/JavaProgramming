package lab9;

class Pair<F,S>{
	private F first;
	private S second;
	
	public Pair(F a,S b) {
		first = a;
		second = b;
	}
	
	public F getFirst() {
		return first;
	}
	public void setFirst(F a) {
		first = a;
	}
	
	public S getSecond() {
		return second;
	}
	public void setSecond(S b) {
		second = b;
	}
}

public class Generics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pair<Double,Boolean>temp = new Pair<Double,Boolean>(3.14,false);
			System.out.println("First of object1:"+
			temp.getFirst() +"\nSecond  of object1:" + temp.getSecond());
			Pair<String,Integer>temp2 = new Pair<String,Integer>("Srihari",2018103601);
			System.out.println("First of object2:"+ temp2.getFirst()
			+"\nSecond  of object2:" + temp2.getSecond());
	}

}
