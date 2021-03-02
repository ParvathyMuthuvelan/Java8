package com.training.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TimeDiff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

		System.out.println("Time 1");
		String str1 = scanner.nextLine();
		System.out.println("Time 2");
		String str2 = scanner.nextLine();
		LocalTime time1 = null;
		LocalTime time2 = null;
		try {
			time1 = LocalTime.parse(str1, dateTimeFormatter);
			time2 = LocalTime.parse(str2, dateTimeFormatter);
			long hours = time1.until(time2, ChronoUnit.MINUTES);
			System.out.println(hours);
		} catch (Exception e) {
			System.out.println(" Invalid Time");
			
		}

	}
}
