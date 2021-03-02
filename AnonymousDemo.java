package com.training.java8;

//class CThread implements Runnable
//{
//
//	@Override
//	public void run() {
//	System.out.println("Thread started");
//		
//	}
//
//	
//}
public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CThread thread=new CThread();
//		Thread t=new Thread(thread);
//		t.start();
		// Anonymous class
		// List list=new ArrayList();
		// Runnable ref=new CThread();
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread started");
			}
		};
		// r.start();
//	Thread t=new Thread(r);
//	t.start();
		// Lambda Expression
		Runnable ref = () -> {
			System.out.println("Thread1 started");
		};
		Thread t = new Thread(ref);
		t.start();
	}
}
