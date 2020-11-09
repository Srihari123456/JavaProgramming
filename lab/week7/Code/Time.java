package lab6;
import java.util.*;
public class Time {
private int seconds,minutes,hours;
	
	Time(){
		seconds = 0;
		minutes = 0;
		hours = 0;
	}
	
	public void setSecond(int ss) throws IllegalArgumentException {
		if(ss < 0 || ss > 59)
			throw new IllegalArgumentException();
		else
			seconds = ss;
	}
	public void setMinute(int mm) throws IllegalArgumentException {
		if(mm <0 ||mm>59)
			throw new IllegalArgumentException();
		else
			minutes = mm;
	}
	public void setHour(int hh) throws IllegalArgumentException{
		if(hh<0)
			throw new IllegalArgumentException();
		else
			hours = hh;
	}
	public String toString() {
		return hours+"hrs "+minutes+"mts "+seconds+"sec ";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
