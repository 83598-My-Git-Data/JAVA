package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Fruit f;
		int Counter = 0;
		System.out.println("Enter Size of the Basket -");
		int index=sc.nextInt();
		Fruit []arr=new Fruit[index];
		int choice;
		
		do
		{
			System.out.println("....Welcome To MI Fruit Stall.....");
			System.out.println("1.Add Mango-");
			System.out.println("2.Add Orange-");
			System.out.println("3.Add Apple-");
			System.out.println("4.Display Names of all fuits in Basket -");
			System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7.Mark a fruit as stale");
			System.out.println("8.Mark all sour fruits stale (optional)");
			System.out.println("Enter The Choice -");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thanks for Visiting Us....");
				break;
			case 1:
				if(Counter<index)
				{
					f=new Mango();
					f.AcceptData();
					f.DisplayData();
					arr[Counter]=f;
					Counter++;
				}
//					else
//					{
//						System.out.println("Not Fresh Fruits in the Basket");
//					}
//						
//				}
				break;
			case 2:
				if(Counter<index)
				{
					f=new Orange();
					f.AcceptData();
					f.DisplayData();
					arr[Counter]=f;
					Counter++;
				}
				break;
			case 3:
				if(Counter<index)
				{
					f=new Apple();
					f.AcceptData();
					f.DisplayData();
					arr[Counter]=f;
					Counter++;
				}
				break;
			case 4:
				for(Fruit element:arr)
				{
					System.out.println("Names of The fruit -"+element.getName());
				}
				break;
			case 5:
				for(int i=0;i<Counter;i++) 
				{
					if(arr[i].isFresh()== true) 
					{
					arr[i].DisplayData();
					String s= arr[i].Taste();
					System.out.println("taste is"+s);
					}
				}
				break;
			case 6:
				for(int i=0;i<Counter;i++) 
				{
					if(arr[i].isFresh()== false) 
					{
					arr[i].DisplayData();
					String s= arr[i].Taste();
					System.out.println("taste is"+s);
					}
				}
				break;
			case 7:
				int mark;
				System.out.println("Enter index to mark ");
				mark=sc.nextInt();
				if(mark<index) 
				{
					for(int j=0;j<Counter;j++) 
					{
						if( mark == j)
					arr[j].setFresh(false);
					
					}
				}
				break;
			case 8:
				for(int k=0;k<Counter;k++) {
					
					if(arr[k].Taste()== "sour" ) 
					{
						arr[k].setFresh(false);
					}
					
				}
				break;
//				
			}
		}while(choice!=0);
			
		

	}

}
