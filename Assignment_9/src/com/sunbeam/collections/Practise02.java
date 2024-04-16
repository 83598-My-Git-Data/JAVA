package com.sunbeam.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class Practise02 {

	public static void main(String[] args)
	{
		Vector<Student> v1=new Vector<>();
		v1.add(new Student(10,"Rohit",89.67));
		v1.add(new Student(15,"vedant",87.60));
		v1.add(new Student(13,"Rushi",78.60));
		v1.add(new Student(12,"Abhi",68.89));
		v1.add(new Student(11,"Rohan",76.67));
		
		System.out.println("Size of the Vector -"+v1.size());
		System.out.println("Cpacity of the Vector -"+v1.capacity());
		
		System.out.println("Using Enumeration -");
		Enumeration<Student> e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(" The Elements - "+e1.nextElement());
			
		}
		v1.add(new Student(14,"Bobby",56.67));
		Student s1=new Student(16,"Carol",80.99);
		v1.addElement(s1);
		System.out.println("Size of the Vector -"+v1.size());
		System.out.println("Cpacity of the Vector -"+v1.capacity());
		System.out.println("Enter The Arraylist of Student -"+v1.toArray());
		class Name_Comparator implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2)
			{
			int value = o1.name.compareTo(o2.name);
				return value;
			}
		}
		Comparator<Student> n2=new Name_Comparator();
		Collections.sort(v1,n2);
		
		Enumeration<Student> e2 = v1.elements();
				while(e2.hasMoreElements())
				{
					System.out.println("After sorting on name -"+e2.nextElement());
				}

	}

}
