package com.wipro.calculator;
import java.util.Scanner;
//import java.lang.*;
//Class name and File name should be same
public class calculator {
	
	public static void  main(String args[]) {
		//take input from user
		//new keyword use to create object
		Scanner scan = new Scanner(System.in);
		
		//local variables
		
		int numberone, numbertwo, result;
		
		//read int values
		System.out.println("Enter Number 1");
		numberone = scan.nextInt();
		
		System.out.println("Enter Number 2");
		numbertwo = scan.nextInt();
		
		result = numberone + numbertwo;
		
		System.out.println("Addition of Two Number = " + result);
		System.out.println("Welcome ..");
		
		//in this program predefined class are
		//System and String all classes starts with capital later
		
		
	}

}
