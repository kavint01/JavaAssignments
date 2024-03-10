package com.wileyedge.datastructures;

import java.util.Hashtable;
import java.util.Scanner;

public class JavaAnagrams {

	public static void main(String[] args) {
		Hashtable<Character,Integer> table=new Hashtable<>();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			table.put(c,table.getOrDefault(c,0)+1);
		}
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(table.containsKey(c)) {
				table.put(c,table.get(c)-1);
				if(table.get(c)==0) 
					table.remove(c);
			}
		}
		System.out.println(table.size()==0?"true":"false");
	}

}
