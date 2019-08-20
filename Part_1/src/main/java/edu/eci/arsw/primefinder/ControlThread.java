//Mami

package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.List;

public class ControlThread extends Thread{

	public static Object obj;
	List<PrimeFinderThread> thList = new ArrayList<PrimeFinderThread>();
	
	public ControlThread(List<PrimeFinderThread> thList) {
		super();
		this.thList = thList;
		obj = new Object();
	}
	
	public void run() {
		for(int i=0;i<thList.size();i++)thList.get(i).start();
		synchronized (obj) {
			
			thList.notifyAll();
		}
	}
	
	public static Object getObj() {
		return obj;
	}
	public static void setObj(Object obj) {
		ControlThread.obj = obj;
	}
	public List<PrimeFinderThread> getThList() {
		return thList;
	}
	public void setThList(List<PrimeFinderThread> thList) {
		this.thList = thList;
	}
	
	
	
}
