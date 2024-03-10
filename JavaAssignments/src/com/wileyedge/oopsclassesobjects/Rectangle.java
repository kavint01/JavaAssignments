package com.wileyedge.oopsclassesobjects;

public class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calArea(){
		return width*height;
	}
	public double calPerimeter(){
		return 2*(width+height);
	}
}
