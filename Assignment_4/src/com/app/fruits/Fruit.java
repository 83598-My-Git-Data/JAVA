package com.app.fruits;

import java.util.Scanner;

public class Fruit 
{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	
	public Fruit() 
	{
		
	}

	public Fruit(String color, double weight, String name, boolean isFresh)
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public boolean setFresh(boolean isFresh) {
		return this.isFresh = isFresh;
	}

	@Override
	public String toString() 
	{
		return "fruits = "+name+","+color+","+weight+","+isFresh;
	}
	public String Taste()
	{
			return "No Specific Taste";
	}
	
	public void AcceptData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Fruit Name -");
		name=sc.next();
		System.out.println("Enter The colour of the fruit -");
		color=sc.next();
		System.out.println("Enter The weight of fruit -");
		weight=sc.nextDouble();
	}
	
	public void DisplayData() 
	{
		System.out.println("Fruit Name -"+name);
		System.out.println("color -"+color);
		System.out.println("Weight -"+weight);

	}
}

