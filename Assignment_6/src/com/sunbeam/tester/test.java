package com.sunbeam.tester;

import java.util.Scanner;

import com.Sunbeam.entities.StringLength;
import com.Sunbeam.exceptions.ExceptionLineTooLong;

public class test 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringLength l1=new StringLength();
		try
		{
			System.out.println("Enter The String -");
			String s=sc.nextLine();
			l1.setString(s);
		}catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Inside Finally block");
			sc.close();
		}
		System.out.println("Program executed successfullly");
	}

}
