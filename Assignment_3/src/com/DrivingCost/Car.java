package com.DrivingCost;
import java.util.Scanner;
public class Car 
{
	Scanner sc = new Scanner(System.in);
	double totalMiles;
	double costPerGallon;
	double milesPerGallon;
	double parkingFees;
	double tolls;
	double totalCost;
	
        // Prompt user for input
		public void accept() 
		{
			System.out.println("Enter info to calculate daily driving cost:");
			System.out.print("Total miles -");
		    totalMiles = sc.nextDouble();

	        System.out.print("Cost per gallon of gasoline: $");
	        costPerGallon = sc.nextDouble();

	        System.out.print("Average miles per gallon: ");
	        milesPerGallon = sc.nextDouble();

	        System.out.print("Parking fees per day: $");
	        parkingFees = sc.nextDouble();

	        System.out.println("Tolls per day: $");
	        tolls = sc.nextDouble();
		}
        public void Display()
        {
        	double gallonsUsed = totalMiles / milesPerGallon;
            double costOfGas = gallonsUsed * costPerGallon;
        	totalCost = costOfGas + parkingFees + tolls;
        	System.out.println(totalCost);
		}
}


