package com.wileyedge.exceptionhandlingassignment;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		try {
			int n=number1/number2;
			System.out.println("Successfully divided, result= "+n);
		}catch(Exception e){
			throw e;
		}
	}

}
