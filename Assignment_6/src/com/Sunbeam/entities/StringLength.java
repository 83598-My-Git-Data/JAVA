package com.Sunbeam.entities;

import java.util.Scanner;

import com.Sunbeam.exceptions.ExceptionLineTooLong;

public class StringLength 
{
		private String s;
		private int length;
	
//		public StringLength() 
//		{
//			
//		}
//		public StringLength(String s, int length) 
//		{
//			
//			this.s = s;
//			this.length = length;
//		}
		
		public void setString(String s) 
		{
			if(s.length()>2)
			{
				throw new ExceptionLineTooLong();
			}
			this.s=s;
		}
//		public void Accept()
//		{
//			Scanner sc=new Scanner(System.in);
//			s=sc.nextLine();
//		}
		@Override
		public String toString() 
		{
		return "String-"+s;
		}
}

