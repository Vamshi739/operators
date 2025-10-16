package com.codegnan.operatorexamples;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter year");
		int year=scanner.nextInt();
		
		String result=(year %400==0) || (year %4==0  && year %100!=0)? "leap year":"not leap year";
		System.out.println(result);
		scanner.close();
		
		

	}

}
