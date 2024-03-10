package com.str.utility.stringAssignments;

import java.util.Scanner;

public class BiggestWord {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		String ans="";
		for(String w : str) {
			if(w.length()>ans.length()) {
				ans=w;
			}
		}
		System.out.println(ans);
	}
}