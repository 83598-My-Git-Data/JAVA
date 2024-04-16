package com.sunbeam.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practise05 {

	public static void main(String[] args) 
	{
		Deque<Student> d2=new ArrayDeque<>();
		d2.push(new Student(10,"Rohit",89.67));
		d2.push(new Student(15,"vedant",87.60));
		d2.addFirst(new Student(13,"Rushi",78.60));
		d2.push(new Student(12,"Abhi",68.89));
		d2.addFirst(new Student(11,"Rohan",76.67));
		
		while(!d2.isEmpty())
		{
			Student element=d2.poll();
			System.out.println("Student - "+element);
		}
		for(Student s:d2)
		{
			System.out.println("Student Details -"+s);
		}
		System.out.println("Pop Out the Elements - "+d2.pop());
		System.out.println("Peek Element is -"+d2.peek());
		
	}

}
