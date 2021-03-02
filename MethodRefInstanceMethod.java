package com.java8.methodref;
@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class MethodRefInstanceMethod {
	
	 
	    public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
	    	MethodRefInstanceMethod obj = new MethodRefInstanceMethod();   
	    	//obj.myMethod();
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  
	}

