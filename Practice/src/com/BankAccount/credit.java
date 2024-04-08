package com.BankAccount;

import java.util.Scanner;

public class credit
{
//	Develop a Java application that determines whether any of several department-store customers has
//	exceeded the credit limit on a charge account.
//	For each customer,the following facts are available:
//	a) account number
//	b) pending balance at the beginning of the month
//	c) total of all items charged by the customer this month
//	d) total of all credits applied to the customer’s account this month
//	e) allowed credit limit.
//	The program should input all these facts as integers, calculate the new balance (= beginning
//	balance+ charges – credits), display the new balance and determine whether the new balance
//	exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//	program should display the message "Credit limit exceeded".
//	For eg -
//	Allowed Credit = 50000
//	total items charged = 25000
//	total all credit applied in this month = 10000
//	pending balance at the begining of the month = 5000
//	new balance for next month = 5000+25000-10000 => 20000 < Allowed Limit

	private final int accno=++generate_accno;
	private int Begin_balance;
	private int Charges;
	private int credits;
	private int allow_credit;
	private int new_Balance;
	private static int generate_accno=1000;
	Scanner sc =new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("pending balance at the beginning of the month"+Begin_balance);
		Begin_balance=sc.nextInt();
		System.out.println("total of all items charged by the customer this month"+Charges);
		Charges=sc.nextInt();
		System.out.println("total of all credits applied to the customer’s account this month"+credits);
		credits=sc.nextInt();
		System.out.println("allowed credit limit"+allow_credit);
		allow_credit=sc.nextInt();
	}
	public void Display() 
	{
		System.out.println("Allowed Credit - "+allow_credit);
		System.out.println("total items charged"+Charges);
		System.out.println("total all credit applied in this month -"+credits);
		System.out.println("pending balance at the begining of the month-"+Begin_balance);

		
	}
	public void newBalance()
	{
		new_Balance=Begin_balance+Charges-credits;
		if(new_Balance>allow_credit)
		{
			System.out.println("Credit Limit Exceeded...");
		}
		else 
		{
			System.out.println("new balance for next month"+new_Balance);
		}
		
	}
	
	
}
