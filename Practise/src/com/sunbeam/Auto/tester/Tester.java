package com.sunbeam.Auto.tester;

import com.sunbeam.Auto.Car;
import com.sunbeam.Auto.Music;

public class Tester {

	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.AcceptCar();
		Music m1=new Music();
		m1.AcceptMUsic();
		c1.setP(m1);
		c1.DisplayCar();
		
		// TODO Auto-generated method stub

	}

}
