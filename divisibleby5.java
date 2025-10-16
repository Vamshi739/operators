package com.codegnan.operatorexamples;

import java.util.Scanner;

public class divisibleby5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in );
		
		
		System.out.println("Enter number:");
		int num=scanner.nextInt();
		
		
		//syntax(condition) ?exp1:expo2;
		String result=(num%5==0)? "divisible by 5 ":"not divisible by 5";
		System.out.println(result);
		scanner.close();

	}

}
