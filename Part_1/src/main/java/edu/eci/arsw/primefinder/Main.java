package edu.eci.arsw.primefinder;

import java.util.*;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		boolean EnterPressed=false;
		List<PrimeFinderThread> thList = new ArrayList<PrimeFinderThread>();
		thList.add(new PrimeFinderThread(0, 10000000));
		thList.add(new PrimeFinderThread(10000000, 20000000));
		thList.add(new PrimeFinderThread(20000000, 30000000));
		for (PrimeFinderThread pft : thList)
			pft.start();
		Thread t=new Thread() {
			public void run() {
				try {
					Thread.currentThread().sleep(5000);
					System.out.println("Han pasado 5 segundos");
					thList.wait();
				} catch (Exception e) {

				}
			}
		};
		t.start();
		
		JPanel contentPane = new JPanel();
		contentPane.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					thList.notify();
					Thread.currentThread().notify();
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		while(!EnterPressed){

		}
	}
}
