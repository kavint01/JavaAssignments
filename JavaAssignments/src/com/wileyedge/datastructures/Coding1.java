package com.wileyedge.datastructures;

import java.util.*;

public class Coding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] contri=new int[n];
		for(int i=0;i<n;i++) {
			contri[i]=sc.nextInt();
		}
		int[] ans=new int[n];
		for(int i=0;i<n-2;i++) {
			ans[i]=contri[i+1]+contri[i+2];
		}
		ans[n-2]=contri[n-1]+contri[0];
		ans[n-1]=contri[0]+contri[1];
		for(int res : ans)
			System.out.print(res + " ");
	}

}
