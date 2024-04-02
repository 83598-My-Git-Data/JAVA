import java.util.Scanner;

public class Binary {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num -");
		num=sc.nextInt();
		String binary=Integer.toBinaryString(num);
		String octal=Integer.toOctalString(num);
		String hexadecimal=Integer.toHexString(num);
		
		System.out.println("Binary Equivalent -"+binary);
		System.out.println("octal Equivalent -"+octal);
		System.out.println("Hexadecimal Equivalent -"+hexadecimal);
		
		
		// TODO Auto-generated method stub

	}

}
