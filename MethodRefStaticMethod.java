package com.java8.methodref;
import java.util.function.BiFunction; 

	
	import java.util.List;
	import java.util.ArrayList;

	public class MethodRefStaticMethod {

	   public static void main(String args[]) {
	      List names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
	   }
	}