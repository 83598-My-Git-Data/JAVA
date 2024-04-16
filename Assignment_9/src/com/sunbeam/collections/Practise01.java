package com.sunbeam.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Practise01 {

	public static void main(String[] args) 
	{
		List<Student> s1=new ArrayList<>();
		s1.add(new Student(10,"Rohit",89.67));
		s1.add(new Student(15,"vedant",87.60));
		s1.add(new Student(13,"Rushi",78.60));
		s1.add(new Student(12,"Abhi",68.89));
		s1.add(new Student(11,"Rohan",76.67));
		
		for(Student s:s1)
		{
			System.out.println(s);
		}
		Collections.sort(s1);
		
		System.out.println("After Natural ordering-");
		
		for(Student s:s1)
		{
			System.out.println(s);
		}
		
		class Name_Comparator implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) 
			{
				int value=o1.name.compareTo(o2.name);
				return value;
			}
			
		}
		
		Comparator<Student> n1=new Name_Comparator();
		Collections.sort(s1,n1);
		
		System.out.println("After Sorting on name -");
//		for(Student s:s1)
//		{
//			System.out.println(s);
//		}
		Iterator<Student> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println("Sorted List -"+itr.next());
		}
		Student Std=new Student();
		Std.SetId(11);
		
	}

}
