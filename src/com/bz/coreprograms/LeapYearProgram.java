package com.bz.coreprograms;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {

		int year;
		System.out.println("Enter an Year : ");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("this year is a leap year");
		else
			System.out.println("this year is not a leap year");

	}
}
