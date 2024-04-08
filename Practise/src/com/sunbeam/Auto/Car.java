package com.sunbeam.Auto;

import java.util.Scanner;

public class Car 
{
	private String Cname;
	private String Model;
	private Engine e;
	private Music p;
	public Car(String cname, String model, Engine e, Music p) 
	{
		Cname = cname;
		Model = model;
		this.e = e;
		this.p = p;
	}
	
	public Car()
	{
		e=new Engine();
	}

	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public Music getP() {
		return p;
	}
	public void setP(Music p) {
		this.p = p;
	}
	
	public void AcceptCar()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Car Name-");
		Cname=sc.nextLine();
		System.out.println("Enter The Model -");
		Model=sc.nextLine();
		System.out.println("Enter The Engine Details -");
		e.AcceptEngine();
	}
	public void DisplayCar()
	{
		System.out.println("Car Name -"+Cname);
		System.out.println("Car Model -"+Model);
		System.out.println("Engine Details -");
		e.DisplayEngine();
		if(p!=null)
		{
			p.DispalyMusic();
		}
	}
	
	
	
	
}
