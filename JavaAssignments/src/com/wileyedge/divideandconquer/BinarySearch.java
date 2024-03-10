package com.wileyedge.divideandconquer;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.print("Enter the element to be searched: ");
		int s=sc.nextInt();
		bs(arr,0,n-1,s);
	}
	public static void bs(int[] arr,int low, int high, int search) {
		int mid=(low+high)/2;
		if(low>high) {
			System.out.println("Element not present in input array.");
			return;
		} 
		if(arr[mid]==search) {
			System.out.println("Element found at index: "+ mid);
			return;
		}else if(arr[mid]>search)
			bs(arr,low,mid-1,search);
		else
			bs(arr,mid+1,high,search);
	}
}
