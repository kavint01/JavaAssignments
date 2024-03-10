package com.wileyedge.multithreading;

class HelloWorldThread implements Runnable{ //extends Thread
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
	}
}

public class HelloWorld{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldThread demo=new HelloWorldThread();
		Thread t=new Thread(demo);
		t.start();
	}

}
