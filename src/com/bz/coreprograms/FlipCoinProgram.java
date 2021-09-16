package com.bz.coreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinProgram {
	public static void main(String[] args) {

		int totalValue = 0;
		float heads = 0, tails = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of flip coin: ");
		int flip = sc.nextInt();
		totalValue = flip;

		while (flip != 0) {

			Random rand = new Random();
			int randomCheck = rand.nextInt(2);
			flip--;

			if (randomCheck < 0.5) {
				heads = heads + 1;
				System.out.println("this is head");

			}

			else {
				tails = tails + 1;
				System.out.println("this is tail");

			}
		}

		System.out.println("the percentage of heads is " + heads / totalValue);
		System.out.println("the percentage of tails is " + tails / totalValue);

	}

}
