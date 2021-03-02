package com.java8.methodref;
@FunctionalInterface 
interface MInterface{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class MethodRefConstructor {

	
	    public static void main(String[] args) { 
	    	//Method reference to a constructor
	    	//Hello obj=new Hello();
	        MInterface ref = Hello::new;  
	        ref.display("Hello World!");  
	    }  
	}
