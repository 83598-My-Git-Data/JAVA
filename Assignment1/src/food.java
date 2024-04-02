import java.util.Scanner;

public class food {

	public static void main(String[] args) 
	{
		int s1=12;
		int s2=20;
		int s4=35;
		int s3=30;
		int total=0;
		int choice;
		int quantity;
		Scanner sc=new Scanner(System.in);
//		choice=sc.nextInt();
//		if(args.length == 1) 
//		{
//			System.out.println("args[0] - "+args[0]);
//			int quantity = Integer.parseInt(args[0]);
//		}
		do
		{
			System.out.println("Menu-");
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Idli");
			System.out.println("4.Pohe");
			System.out.println("5.Generate Bill-");
			System.out.println("Enter the Choice -");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Dosa Price -"+s1);
			System.out.println("Enter The Quantity -");
			quantity=sc.nextInt();
			total=total+s1*quantity;
			break;
		case 2:
			System.out.println("Samosa Price -"+s2);
			System.out.println("Enter The Quantity -");
			quantity=sc.nextInt();
			total=total+s2*quantity;
			break;
		case 3:
			System.out.println("Idli Price -"+s3);
			System.out.println("Enter The Quantity -");
			quantity=sc.nextInt();
			total=total+s3*quantity;
			break;
		case 4:
			System.out.println("Pohe Price -"+s4);
			System.out.println("Enter The Quantity -");
			quantity=sc.nextInt();
			total=total+s4*quantity;
			break;
		case 5:
			System.out.println("Generate the bill-"+total);
			break;
		default:
			System.out.println("Thanks for visting....");
			break;
			
		}
		}while(choice!=0);
		// TODO Auto-generated method stub

	}

}
