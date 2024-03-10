package com.str.utility.stringAssignments;

import java.util.Scanner;

public class AbbreviateSentence {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i==0) ans=ans+s.charAt(i);
			else if(s.charAt(i-1)==' ' && s.charAt(i)!=' ') {
				ans=ans+s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}