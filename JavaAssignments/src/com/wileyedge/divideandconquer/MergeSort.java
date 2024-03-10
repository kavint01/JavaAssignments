package com.wileyedge.divideandconquer;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		mergeSort(arr,0,n-1);
		System.out.println("Sorted elements in arrays: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void mergeSort(int[] arr,int low,int high) {
		if(low<high) { 
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr, low, mid, high);
		}
	}
	public static void merge(int[] arr,int low,int mid,int high) {
		int i, j , k;
		int n1=mid-low+1;
		int n2=high-mid;
		int[] leftArray=new int[n1];
		int[] rightArray=new int[n2];
		for(i=0;i<n1;i++) {
			leftArray[i]=arr[low+i];
		}
		for(j=0;j<n2;j++) {
			rightArray[j]=arr[mid+j+1];
		}
		i=0;
		j=0;
		k=0;
		while(i<n1 && j<n2) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			}else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
}
