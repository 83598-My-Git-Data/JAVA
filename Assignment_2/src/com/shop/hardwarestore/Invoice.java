package com.shop.hardwarestore;

import java.util.Scanner;

public class Invoice 
{
//	Create a class called Invoice that a hardware store might use to represent an invoice for an item
//	sold at the store. An Invoice should include four pieces of information as fields—a part number
//	(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//	price per item (double). Your class should have a constructor
//	that initializes the four instance variables. Provide a set and a get method for each instance variable.
//	calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//	amount as a double value.
//	If the quantity is not positive, it should be set to 0.
//	If the price per item is not positive, it should be set to 0.0.
//	Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

	private String Part_No;
	private String Part_Desc;
	private int Quantity;
	private double price;
	Scanner sc = new Scanner(System.in);
	Invoice()
	{
		Part_No=" ";
		Part_Desc=" ";
		Quantity = 0;
		price=0.0;	
	}
	Invoice(String Part_No,String Part_Desc,int Quantity,double price )
	{
		this.Part_No=Part_No;
		this.Part_Desc=Part_Desc;
		this.Quantity=Quantity;
		this.price=price;
	}
	public String getPart_No() {
		return Part_No;
	}
	public void setPart_No(String part_No) {
		Part_No = part_No;
	}
	public String getPart_Desc() {
		return Part_Desc;
	}
	public void setPart_Desc(String part_Desc) {
		Part_Desc = part_Desc;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void accept()
	{
		System.out.println("Enetr The Part_No-");
		Part_No=sc.nextLine();
		System.out.println("Enetr The Part_Desc-");
		Part_Desc=sc.nextLine();
		System.out.println("Enetr The Quantity-");
		Quantity=sc.nextInt();
		System.out.println("Enetr The Price-");
		price=sc.nextDouble();
	}
	public void CalculateAmount()
	{
		double amount=0;
		amount=amount+(Quantity * price);
		if(Quantity<0 & price<0)
		{
			amount=0;
			price=0.0;
		}
		else
		{
			System.out.println("Enter The Amount -"+amount);
		}
		
	}
	
	
	
}
