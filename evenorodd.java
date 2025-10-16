package com.codegnan.operatorexamples;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter number:");
		int num=scanner.nextInt();
		
		//syntax(condition) ?exp1:expo2;
		String result=(num & 1)==0? "Entered even ":"Entered odd";
		System.out.println(result);
		scanner.close();
		

	}

}
