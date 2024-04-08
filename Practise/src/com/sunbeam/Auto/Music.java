package com.sunbeam.Auto;

import java.util.Scanner;

public class Music 
{
	private String Mplayer;
	private double size;
	public Music() 
	{
		
		// TODO Auto-generated constructor stub
	}
	public Music(String mplayer, double size) 
	{
		Mplayer = mplayer;
		this.size = size;
	}
	public String getMplayer() {
		return Mplayer;
	}
	public void setMplayer(String mplayer) {
		Mplayer = mplayer;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public void AcceptMUsic()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name of MPlayer -");
		Mplayer=sc.nextLine();
		System.out.println("Enter The Size of Mplayer-");
		size=sc.nextDouble();	
	}
	public void DispalyMusic()
	{
		System.out.println("MPlayer -"+Mplayer);
		System.out.println("Size -"+size);	
	}
	

}
