package com.Sunbeam.String;

import java.util.Scanner;

public class Count 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence to count");
		String s;
		s=sc.nextLine();
		
		int index=0;
		
		String arr[]=s.split(" ");
		
		for(String element:arr) {
			
			index++;
		}
		System.out.println("count of words is"+index);
		
	}

}

