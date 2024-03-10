package com.wileyedge.dynamicprogramming;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj=new Factorial();
		System.out.println("Factorial using normal recursion is "+obj.fact(10));
		int[] dp=new int[11];
		System.out.println("Factorial using memoization is "+obj.fact(10,dp));
		System.out.println("Factorial using tabulation is "+obj.fact());
	}
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	int fact(int n,int[] dp) {
		dp[0]=1;
		if(n==0 || n==1) {
			return 1;
		}
		if(dp[n]!=0) return dp[n];
		dp[n]=n*fact(n-1,dp);
		return dp[n];
	}
	int fact() {
		int[] dp=new int[11];
		dp[0]=1;
		for(int i=1;i<11;i++) {
			dp[i]=i*dp[i-1];
		}
		return dp[10];
	}
}
