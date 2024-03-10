package com.wileyedge.oopsclassesobjects;

public class Main {
	public static void main(String[] args) {
		Shape[] shape=new Shape[2];
		shape[0]=new Rectangle(5,10);
		shape[1]=new Triangle(5,12);
		for(Shape s : shape) {
			System.out.println(s.calArea());
		}
	}
}
