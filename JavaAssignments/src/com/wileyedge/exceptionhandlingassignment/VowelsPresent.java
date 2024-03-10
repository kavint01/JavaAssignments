package com.wileyedge.exceptionhandlingassignment;

import java.util.Scanner;

public class VowelsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try {
			if(vowel(s)) System.out.println(s+" doesn't contain any vowel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean vowel(String s) throws Exception{
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				Exception e=new Exception("Contains VOWEL !");
				throw e;
			}
		}
		return true;
	}
}
