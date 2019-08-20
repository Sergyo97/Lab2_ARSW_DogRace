package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static Object obj;
	public static void main(String[] args) {
		
		obj = new Object();
		List<PrimeFinderThread> thList = new ArrayList<PrimeFinderThread>();
		thList.add(new PrimeFinderThread(0, 10000000));
		thList.add(new PrimeFinderThread(10000000, 20000000));
		thList.add(new PrimeFinderThread(20000000, 30000000));
		ControlThread ct=new ControlThread(thList);
		ct.start();

	}
	
	public static Object getObj() {
		return obj;
	}
	public static void setObj(Object obj) {
		Main.obj = obj;
	}
	
}
