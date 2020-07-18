package com.montran.pojo;

public class Time {
  private int hours;
  private int minute;
  
  public void settime(int hours, int minute) {
	  this.hours=hours;
	  this.minute=minute;

  }
  
   public Time sum(Time t2) {
	  hours=hours+t2.hours;
	  minute=minute + t2.minute;
	  if (minute>60)
		  hours=hours+1;
	      minute=minute-60;
	      Time t3=new Time();
	      t3.settime(hours,minute);
	      return t3;	  
  }
  
  void showtime(int hours,int minute) {
	  System.out.println("Time is "+hours+"hrs"+minute+"min");
  }

@Override
public String toString() {
	return "Time [hours=" + hours + ", minute=" + minute + "]";
}
}

