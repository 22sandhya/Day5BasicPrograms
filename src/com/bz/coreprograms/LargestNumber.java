package com.bz.coreprograms;

public class LargestNumber {
	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		int c = 8;
		if (a > b && a > c) {
			System.out.println("a is largest");
		} else if (b > a && b > c) {
			System.out.println("b is largest");
		} else if (c > a && c > b) {
			System.out.println("c is largest");
		}
	}
}
