package com.app.fruits;


public class Apple extends Fruit
{

	public Apple() 
	{
		super();
	}
	
	
	public Apple(String color, double weight, String name, boolean isFresh) {
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
		return "Sweet n sour";
	}
	
	

}