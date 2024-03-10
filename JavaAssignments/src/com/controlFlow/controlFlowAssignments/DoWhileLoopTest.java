package com.controlFlow.controlFlowAssignments;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,i=0;
		do {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			i++;
		}while(i<10);
	}

}
