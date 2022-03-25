package com.Mavenproject._02_2022;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		int n1,n2,result;
		
		Scanner a= new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		n1=a.nextInt();
		
		System.out.println("Enter the 2nd number:");
		n2=a.nextInt();
		
		result=n1*n2;
				
		System.out.println("Multiply:" +result);
		result=a.nextInt();
	
		a.close();

	}

}
