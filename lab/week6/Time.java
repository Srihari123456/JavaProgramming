package lab5;
import java.util.*;
public abstract class Time implements StopWatch{
	protected int seconds,minutes,hours;
	
	protected Time() {
		seconds = 0;
		minutes = 0;
		hours = 0;
	}
	
	protected Time(int hh,int mm,int ss) {
		seconds = ss;
		minutes = mm;
		hours = hh;
		minutes += seconds/60;
		hours += minutes/60;
		seconds %= 60;
		minutes %= 60;
	}
	
	public int getSeconds() {
		return seconds;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getHours() {
		return hours;
	}
	
	public  void display(){
		System.out.println(hours+"hrs "+minutes+"mts "+seconds+"sec");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
