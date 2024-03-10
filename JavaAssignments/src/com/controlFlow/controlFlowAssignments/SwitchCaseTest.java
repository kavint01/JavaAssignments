package com.controlFlow.controlFlowAssignments;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		char capC=Character.toUpperCase(c);
		switch(capC) {
			case 'A':
				System.out.println(c+" is a vowel.");
				break;
			case 'E':
				System.out.println(c+" is a vowel.");
				break;
			case 'I':
				System.out.println(c+" is a vowel.");
				break;
			case 'O':
				System.out.println(c+" is a vowel.");
				break;
			case 'U':
				System.out.println(c+" is a vowel.");
				break;
			default:
				System.out.println(c+" is an alphabet.");
				break;
				
		}
	}

}
