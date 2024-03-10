package com.wileyedge.multithreading;
class Odd extends Thread{
	private Thread t;
	public Odd(Thread t){
		this.t=t;
	}
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n\n----------Odd----------");
		for(int i=1;i<=20;i++) {
			if(i%2==1) System.out.print(i+" ");
		}
	}
}
class Even extends Thread{
	public void run() {
		System.out.println("----------Even----------");
		for(int i=1;i<=20;i++) {
			if(i%2==0) System.out.print(i+" ");
		}
	}
}

public class EvenOdd {
	public static void main(String[] args) {
		Even e=new Even();
		Thread t1=new Thread(e);
		Odd o=new Odd(t1);
		Thread t2=new Thread(o);
		t1.start();
		t2.start();
	}
	
}
