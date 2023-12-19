package oops;

import java.util.Scanner;

public class Bike implements Vehicle {
	Scanner sc = new Scanner(System.in);
	String model_nm;
	String Fuel_type;
   
	public void move()
	{
		System.out.println("Enter the Model_nm");
		model_nm = sc.nextLine();
		System.out.println("Model Name of Motorcycle is:"+model_nm);
		
		
		System.out.println("Enter the Fuel Type");
		Fuel_type = sc.nextLine();
		System.out.println("Fuel Type of Motorcycle is:"+Fuel_type+"\n");
	}
}
