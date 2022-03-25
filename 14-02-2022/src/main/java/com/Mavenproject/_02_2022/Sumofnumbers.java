package com.Mavenproject._02_2022;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		
		int n1,n2,num;
		
		Scanner a= new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		n1=a.nextInt();
		
		System.out.println("Enter the 2nd number:");
		n2=a.nextInt();
		
		num=n1+n2;
				
		System.out.println("Sum:" +num);
		num=a.nextInt();
	
		a.close();
	}

}
