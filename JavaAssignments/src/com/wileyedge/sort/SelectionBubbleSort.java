package com.wileyedge.sort;

import java.util.Scanner;

public class SelectionBubbleSort {
	public void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					int temp=arr[j];
					arr[j]=arr[min];
					arr[min]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
	public void BubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
//			System.out.print(arr[j]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SelectionBubbleSort test=new SelectionBubbleSort();
		System.out.println("----Selection Sorting-----");
		test.SelectionSort(arr);
		System.out.println("\n----Bubble Sorting-----");
		test.BubbleSort(arr);
	}

}
