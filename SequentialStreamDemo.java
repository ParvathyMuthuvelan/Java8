package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class SequentialStreamDemo {

	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "H", "E", "L", "L", "O");

		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEachOrdered(System.out::print);
		

		
	}
}
