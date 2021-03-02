package com.training.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap);
	}

}
