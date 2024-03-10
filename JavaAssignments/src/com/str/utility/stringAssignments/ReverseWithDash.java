package com.str.utility.stringAssignments;

import java.util.Scanner;

public class ReverseWithDash {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String ans="";
		int i;
		for(i=0;i<input.length()-1;i++) {
			ans="-"+input.charAt(i)+ans;
		}
		ans=input.charAt(i)+ans;
		System.out.println(ans);
	}
}