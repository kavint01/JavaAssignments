package com.str.utility.stringAssignments;

import java.util.Scanner;

public class ReplaceFirstLast {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0));
	}
}