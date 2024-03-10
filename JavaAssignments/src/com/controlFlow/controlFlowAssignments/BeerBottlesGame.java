package com.controlFlow.controlFlowAssignments;

import java.util.Scanner;

public class BeerBottlesGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("There are 21 beer bottles...");
		System.out.println("Computer and yourself, there are 2 players");
		System.out.println("At a time, each one can pick up any no. of bottles between 1 and 4 (inclusive)");
		System.out.println("Will you like to play first?");
		String answer=sc.nextLine();
		int bottles=21,userChoice,computerChoice;
		while(bottles>1) {
			System.out.println("How many would you like to pick up?");
			userChoice=sc.nextInt();
			bottles-=userChoice;
			if(bottles <= 5) break;
			computerChoice=(int)Math.floor((Math.random()*3)+1);
			System.out.println("Computer has picked "+computerChoice);
			bottles-=computerChoice;
			System.out.println("The bottles remaining are : " + bottles);
		}
		System.out.println("Computer has picked "+(bottles-1));
		bottles=bottles-(bottles-1);
		System.out.println("The bottles remaining are : " + bottles);
		System.out.println("You will have to pick up the last...you are loser");
	}

}
//
