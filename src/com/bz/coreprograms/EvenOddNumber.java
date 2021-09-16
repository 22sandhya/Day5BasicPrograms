package com.bz.coreprograms;

import java.util.Scanner;

public class EvenOddNumber {
	
		public static void main(String[] args) {
			int num;
			System.out.println("enter num: ");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

	}


