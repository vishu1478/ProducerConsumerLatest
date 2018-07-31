package test;

import java.util.ArrayList;

public class Producer implements Runnable {
	ArrayList ar=null;
	int size=5;
	int i=0;
	
	public Producer(ArrayList ar) {
		this.ar=ar;
	}
	public void run() {
		while(true){
			try {
			produce(i++);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}}
	public void produce(int i) throws InterruptedException {
		synchronized(ar){
			while(ar.size()==size) {
			System.out.println("its full.waiting for consumer");
			ar.wait();
			}
		}
		synchronized(ar) {
			System.out.println("producer has produced "+i);
			ar.add(i);
			Thread.sleep(100);
		    ar.notify();
			
		}
	}
	

}
