package com.app.fruits;

public class Orange extends Fruit
{

	public Orange() 
	{
		super();
	}
	
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}


	public void AcceptData()
	{
		super.AcceptData();
		
	}
	public void DisplayData()
	{
		super.DisplayData();
	}
	public String Taste() 
	{
		return "Sour";
	}
	
	

}