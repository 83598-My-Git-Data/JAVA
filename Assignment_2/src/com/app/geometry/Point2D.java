package com.app.geometry;

import java.util.Scanner;

public class Point2D
{
	
	private int x;
	private int y;
	Scanner sc = new Scanner(System.in);
	public Point2D()
	{
		this.x=x;
		this.y=y;
	}
	public String getDetails()
	{
		String Details;
		Details=(x+","+y);
		return Details;
	}
	public boolean isEqual(Point2D a1, Point2D a2) 
	{
		if(a1.x == a2.x && a1.y == a2.y) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void calculateDistance(Point2D a1, Point2D a2) 
	{
		double dist = Math.sqrt( Math.pow(a1.x - a2.x,2 ) +Math.pow(a1.y - a2.y, 2));
		
		System.out.println("Distance is : "+dist);
		
	}
	
	public void accept() 
	{
		System.out.println("enter value of x: ");
		Scanner sc = new Scanner(System.in);
		
		x=sc.nextInt();
		
		System.out.println("enter value of y: ");
		y=sc.nextInt();
		
	}
	public void display() {
		System.out.println(getDetails());
	}
}