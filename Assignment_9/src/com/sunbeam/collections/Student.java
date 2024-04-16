package com.sunbeam.collections;

import java.util.Objects;

public class Student implements Comparable<Student> 
{
	int Roll_no;
	String name;
	double marks;
	public Student() 
	{
		
	}
	public Student(int Roll_no, String name, double marks) 
	{
		this.Roll_no = Roll_no;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() 
	{
		
		return "Student_Details[Roll_No - "+Roll_no+ "Name - "+name+ "Marks - "+marks+"]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Roll_no == other.Roll_no && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Student o)
	{
		int value =this.Roll_no-o.Roll_no;
		return value;
	}
	
	public void SetId(int Roll_no) 
	{
		this.Roll_no=Roll_no;

	}
	
	

}
