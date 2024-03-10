package com.str.utility.stringAssignments;

import java.util.Scanner;

public class AbbreviateWithTwist {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		String ans="";
		for(int i=0;i<str.length;i++) {
			ans=ans+(str[i]).charAt(i);
		}
		System.out.println(ans.toUpperCase());
	}
}