package com.wileyedge.exceptionhandlingassignment;

import java.util.*;

public class OddNumberCheck{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number !");
		}else {
			Exception e=new Exception("Odd Number !");
			throw e;
		}
	}
	
}
