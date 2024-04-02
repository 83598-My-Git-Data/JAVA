import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 -");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			System.out.println("Enter the num2 -");
			
			if(sc.hasNextDouble())
			{
				num2=sc.nextDouble();
				avg=(num1+num2)/2;
				System.out.println("The Average is -"+avg);
				
			}
		}
		else
		{
			System.out.println("The numbers are not double values:");
		}
		
		

	}

}
