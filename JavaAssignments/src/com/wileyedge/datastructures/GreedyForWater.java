package com.wileyedge.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyForWater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			int[] cb=new int[n];
			for(int i=0;i<n;i++) {
				cb[i]=sc.nextInt();
			}
			Arrays.sort(cb);
			int c=0,i=0;
			while(i<n && c<=x) {
				c+=cb[i];
				if(c>x) break;
				i++;
			}
			System.out.println(i);
		}
	}

}
