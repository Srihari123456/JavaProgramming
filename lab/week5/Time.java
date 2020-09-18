package lab4;
import java.util.*;
public class Time {
	private int ss,mm,hh;
	
	Time(){
		ss = 0;
		mm = 0;
		hh = 0;
	}
	
	Time(int hh,int mm,int ss){
		this.ss = ss;
		this.mm = mm;
		this.hh = hh;
		this.mm += this.ss/60;
		this.hh += this.mm/60;
		this.ss %= 60;
		this.mm %= 60;
	}
	
	public String equals(Time T2) {
		if(this.hh > T2.hh)return "Greater";
		else if(this.hh < T2.hh)return "Smaller";
		else if(this.mm > T2.mm)return "Greater";
		else if(this.mm < T2.mm)return "Smaller";
		else if(this.ss > T2.ss)return "Greater";
		else if(this.ss < T2.ss)return "Smaller";
		else return "Equal";
	}
	
	Time addtime(Time T1, Time T2) {
		Time T3 = new Time(T1.hh+T2.hh,T1.mm+T2.mm,T1.ss+T2.ss);
		return T3;
	}
	
	public String display(int i) {
		String timeRep="";
		if(i == 1)timeRep += (hh)+":"+mm+":"+ss;
		else if(this.hh>=12) {
			timeRep += (hh-12)+":"+mm+":"+ss+"P.M. ";
		}
		else
			timeRep += (hh)+":"+mm+":"+ss+"A.M. ";
		return timeRep;
	}
	
	public String toString() {
		return hh+"hrs "+mm+"mts "+ss+"sec ";
	}
	
	public int getMinutes() {
		return mm;
	}
	public int getSeconds() {
		return ss;
	}
	public int getHours() {
		return hh;
	}
	public void setMinutes(int minutes) {
		hh += minutes/60;
		mm += minutes%60;
	}
	public void setSeconds(int seconds) {
		mm += seconds/60;
		ss += seconds%60;
	}
	public void setHours(int hours) {
		hh+=hours;
	}
	
	public void timeElapsed(int seconds) {
		ss += seconds;
		mm += ss/60;
		hh += mm/60;
		ss %= 60;
		mm %= 60;
//		hh += seconds/3600;
	//	mm += seconds/60;
		//ss += seconds%60;
	}
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours:");
		this.setHours(sc.nextInt());
		System.out.println("Enter the minutes:");
		this.setMinutes(sc.nextInt());
		System.out.println("Enter the seconds:");
		this.setSeconds(sc.nextInt());
	}
	public void displayDetails(String header) {
		System.out.println(header);
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
