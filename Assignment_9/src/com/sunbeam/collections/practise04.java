package com.sunbeam.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class practise04 {

	public static void main(String[] args) 
	{
		Deque<Student> d1=new ArrayDeque<>();
		
		d1.addFirst(new Student(10,"Rohit",89.67));
		d1.add(new Student(15,"vedant",87.60));
		d1.addFirst(new Student(13,"Rushi",78.60));
		d1.add(new Student(12,"Abhi",68.89));
		d1.addLast(new Student(11,"Rohan",76.67));
		
		d1.offerFirst(new Student(17,"Rohit",98.67));
		
		
		for(Student s:d1)
		{
			System.out.println("Student Details -"+s);
		}
		System.out.println("Enter The Head Element - "+d1.peekFirst());
		System.out.println("Enter The Element -"+d1.peekLast());
		
		System.out.println("Remove the element - "+d1.removeFirst());
		System.out.println("Remove the Element -"+d1.pollFirst());
		

	}

}
