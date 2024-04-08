package com.BankAccount;

public class Customer {

	public static void main(String[] args) 
	{
		credit[] arr;
		arr=new credit[2];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new credit();
			arr[i].accept();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i].Display();
			arr[i].newBalance();
		}
	}

}
