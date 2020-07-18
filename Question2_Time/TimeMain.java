package com.montran.main;
import com.montran.pojo.Time;

public class TimeMain {

	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		t1.settime(13,45);
		System.out.println(t1);
		t2.settime(14,22);
		System.out.println(t2);
		t3=t2.sum(t1);
                System.out.println(t3);
  }
}  
