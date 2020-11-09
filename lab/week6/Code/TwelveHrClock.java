package lab5;
import java.util.*;
public class TwelveHrClock extends Time {

	TwelveHrClock(){
		super();
	
	}
	
	TwelveHrClock(int hh,int mm,int ss){
		super(hh,mm,ss);

	}	
	
	public void StartTimer() {
		System.out.println("StopWatch begins!");
		System.out.println("RunningTime-RemainingTime");
		for(int i=0;i<=TimerSeconds;i++)
			System.out.println(i+"\t\t"+(TimerSeconds-i));
	}
	@Override
	public void display() {
		if(hours>=12) {
			System.out.println(hours-12+":"+minutes+":"+seconds+"P.M. ");
		}
		else
			System.out.println(hours+":"+minutes+":"+seconds+"A.M. ");
	}
	
	int difference(Time t2) {
		int res = 0,hh =0,mm = 0,ss = 0;

		int sec1 = this.getHours()*3600 + this.getMinutes()*60 + this.getSeconds();
		int sec2 = t2.getHours()*3600 + t2.getMinutes()*60 + t2.getSeconds();
		return Math.abs(sec1-sec2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
