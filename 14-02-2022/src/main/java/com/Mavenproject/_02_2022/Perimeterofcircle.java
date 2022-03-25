package com.Mavenproject._02_2022;

import java.util.Scanner;

public class Perimeterofcircle {

	public static void main(String[] args) {
		int r;
		double Result;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		r=scanner.nextInt();
		
		Result=2*3.14*r;
		
		System.out.println("Result=" +Result);
		Result=scanner.nextDouble();
		
		scanner.close();
		
	}

}
