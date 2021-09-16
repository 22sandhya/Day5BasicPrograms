package com.bz.coreprograms;

public class PowerofNumber {
	public static void main(String args[]) {
		int num = 41;
		int i = 0, total;
		if (0 <= num) {
			while (i <= num && i < 31) {
				total = (int) Math.pow(2, i);
				System.out.println("2^" + i + " : " + total);
				i++;
			}
		} else {
			System.out.println("you passed wrong value");
		}

	}
}
