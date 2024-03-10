package com.wileyedge.exceptionhandlingassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCheck {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			if(hs.contains(number)) {
				Exception e=new Exception("Duplicates present !!");
				throw e;
			}else {
				hs.add(number);
			}
		}
	}

}
