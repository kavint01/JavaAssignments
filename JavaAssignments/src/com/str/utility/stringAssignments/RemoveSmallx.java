package com.str.utility.stringAssignments;

import java.util.Scanner;

public class RemoveSmallx {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='x') count++;
			else ans=ans+s.charAt(i);
		}
		while(count>0) {
			ans=ans+'x';
			count--;
		}
		System.out.println(ans);
	}
}