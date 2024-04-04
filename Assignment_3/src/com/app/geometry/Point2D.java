//package com.app.geometry;
//
//import java.util.Scanner;
//
//public class Point2D
//{
//	private int x;
//	private int y;
//	public Point2D(int x,int y)
//	{
//		x=this.x;
//		y=this.y;
//	}
//	public String getDetails()
//	{
//		String Details;
//		Details=(x+","+y);
//		return Details;
//	}
//	public boolean isEqual(Point2D a1) 
//	{
//		if(a1.x == a2.x && a1.y == a2.y) 
//		{
//			return true;
//		}
//		else 
//		{
//			return false;
//		}
//	}
//	
//	public void calculateDistance(Point2D a1, Point2D a2) 
//	{
//		double dist = Math.sqrt( Math.pow(a1.x - a2.x,2 ) +Math.pow(a1.y - a2.y, 2));
//		
//		System.out.println("Distance is : "+dist);
//		
//	}
//	public int setX(int x) 
//	{
//		this.x=x;
//		return x;
//	}
//	public int setY(int y) 
//	{
//		this.y=y;
//		return y;
//	}
//	public void accept() 
//	{
//		System.out.println("enter value of x: ");
//		Scanner sc = new Scanner(System.in);
//		
//		x=sc.nextInt();
//		
//		System.out.println("enter value of y: ");
//		y=sc.nextInt();
//		
//	}
//	public void display() {
//		System.out.println(getDetails());
//	}
package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	
	private int x;
	private int y;
	
	
	public Point2D(int x,int y)
	{
	   this.x=x;
	   this.y=y;
	   
		
	}


	public Point2D() {
		// TODO Auto-generated constructor stub
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input from user");
		x=sc.nextInt();
		y=sc.nextInt();
		
	}
	
	 public void  getdetails()
	 {
		 String details;
		 details=x+","+y;
		 System.out.println(details);
		 
		 
	 }
	 public boolean isEqual(Point2D p2)
	 {
		 if(this.getX()==p2.getX()&& this.getY()==p2.getY())
		 {
			 return true;
		 }
		 else
		 {
		 return false;
		 }
		 
		 
	 }
	 

	 
		 
	
	 public double calculatedistance(Point2D p2)
	 {
		 int val1=(p2.getX()-this.getX());
		 int val2=(p2.getY()-this.getY());
		 
		 double sqrVal1=Math.pow(val1, 2);
		 double sqrVal2=Math.pow(val2, 2);
		 
		 
		 double ans;
		 return ans=Math.sqrt(sqrVal1+sqrVal2);
		 
		 
	 }
	
	
	
	
	
	
	
	

}
//}