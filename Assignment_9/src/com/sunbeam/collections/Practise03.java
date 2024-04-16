package com.sunbeam.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Practise03 {

	public static void main(String[] args) 
	{
		Queue<Student> q1=new ArrayDeque<>();
		q1.add(new Student(10,"Rohit",89.67));
		q1.add(new Student(15,"vedant",87.60));
		q1.add(new Student(13,"Rushi",78.60));
		q1.add(new Student(12,"Abhi",68.89));
		q1.add(new Student(11,"Rohan",76.67));
		
		q1.offer(new Student(17,"Rohit",98.67));
		
		System.out.println("The Peek Element is -"+q1.peek());
		System.out.println("The Peek Element is -"+q1.element());
		
		System.out.println("Removed Elements are - "+q1.remove());

	}

}
