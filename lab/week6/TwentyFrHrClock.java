package lab5;
import java.util.*;
public class TwentyFrHrClock extends Time {
	TwentyFrHrClock(){
		super();
	}
	
	TwentyFrHrClock(int hh,int mm,int ss){
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
		System.out.println(hours+":"+ minutes +":"+seconds);
	}
	
	
	public void timeElapsed(int ss) {
		seconds += ss;
		minutes += seconds/60;
		hours += minutes/60;
		seconds %= 60;
		minutes %= 60;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
