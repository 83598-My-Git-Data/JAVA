package com.sunbeam.Arrays;

public class Student 
{
	int roll_no;
	String Name;
	String city;
	double marks;
	
	
	
	public Student(int roll_no, String name, String city, double marks)
	{
		
		this.roll_no = roll_no;
		this.Name = name;
		this.city = city;
		this.marks = marks;
	}



	@Override
	public String toString() 
	{
		return "Student[rollNo - "+roll_no+",Name - "+Name+",city - "+city+",marks - "+marks+"]";
	}
	
//	@Override
//	public int compareTo(Student o) 
//	{
//		int diff=(this.roll_no-o.roll_no);
//		return diff;
//		
//	}
//	
	
	

}
