package com.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		System.out.println("Normal...");
		Stream<Integer> range = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		range.forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});

		System.out.println("Parallel...");

		Stream<Integer> range1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		range1.parallel().forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});

	}

}
