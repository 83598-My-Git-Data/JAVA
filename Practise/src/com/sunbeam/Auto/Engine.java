package com.sunbeam.Auto;

import java.util.Scanner;

public class Engine 
{
	private String Ename;
	private int Eno;
	
	public Engine() 
	{
		
	}
	public Engine(String ename, int eno) 
	{
		Ename = ename;
		Eno = eno;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEno() {
		return Eno;
	}
	public void setEno(int eno) {
		Eno = eno;
	}
	
	public void AcceptEngine()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Engine Name -");
		Ename=sc.nextLine();
		System.out.println("Enter The Engine No -");
		Eno=sc.nextInt();
		
	}
	public void DisplayEngine()
	{
	System.out.println("Ename -"+Ename);
	System.out.println("Eno -"+Eno);
	
	}
	

}
