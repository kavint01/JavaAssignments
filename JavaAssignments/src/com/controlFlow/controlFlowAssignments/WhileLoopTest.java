package com.controlFlow.controlFlowAssignments;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=Integer.parseInt(s);
		int temp=n,r=0;
		while(temp!=0) {
			int d=temp%10;
			r=r*10+d;
			temp/=10;
		}
		if(r==n) System.out.println(n+" is a Palindrome number.");
		else System.out.println(n+" is not a Palindrome number.");
	}

}
