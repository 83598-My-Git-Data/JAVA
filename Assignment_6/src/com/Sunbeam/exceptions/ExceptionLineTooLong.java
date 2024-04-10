package com.Sunbeam.exceptions;

import java.util.Scanner;

public class ExceptionLineTooLong extends RuntimeException 
{
	private String message;
	private String Field;
	
	
	
	public ExceptionLineTooLong()
	{
		
	}
	public ExceptionLineTooLong(String message)
	{
		
		this.message = message;
	}
	
	public ExceptionLineTooLong(String message, String field) 
	{
		
		this.message = message;
		this.Field = field;
	}
	
	@Override
	public void printStackTrace() 
	{
		System.err.println("Exception : ");
		System.err.println("ExceptionLineTooLong : " + message);
	}
	
	
}
