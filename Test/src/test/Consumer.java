package test;

import java.util.ArrayList;

public class Consumer implements Runnable {

	ArrayList ar=null;
	public Consumer(ArrayList ar) {
		this.ar=ar;
	}
	public void run() {
		
		
	}
	public void consumer() {
		synchronized(ar) {
			while(ar.isEmpty()) {
				
			}
		}
	}

}
