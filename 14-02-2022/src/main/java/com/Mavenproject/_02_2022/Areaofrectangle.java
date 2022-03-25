package com.Mavenproject._02_2022;

import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		int l,b,Result;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of length:");
		l=scanner.nextInt();
		
		System.out.println("Enter the value of breadth:");
		b=scanner.nextInt();
		
		Result=l*b;
		
		System.out.println("Result:" +Result);
		Result=scanner.nextInt();
		
		scanner.close();
	}

}
