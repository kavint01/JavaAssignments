package com.str.utility.stringAssignments;

import java.util.Scanner;

public class NextCharacter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)))
				ans=ans + (char)(s.charAt(i)+1);
			else 
				ans=ans+s.charAt(i);
		}
		System.out.println(ans);
	}
}
