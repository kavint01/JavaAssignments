package com.wileyedge.exceptionhandlingassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilePresentAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilePresentAbsent fpa=new FilePresentAbsent();
		fpa.checkFileLocation();
	}
	public void checkFileLocation() {
		try {
			FileInputStream fis=new FileInputStream("C:\\C376");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found.");
			e.printStackTrace();
		}
	}
}
