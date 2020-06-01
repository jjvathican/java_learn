import java.io.*;
import java.util.*;
class exception
{
	public static void main(String args[])throws IOException,ArithmeticException
	{
		
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Divide");
			int a;
			a=s.nextInt();
			int b=10/a;
			if(a!=0)
			{
			System.out.println("Result is"+b);
			throw new ArithmeticException("Error");
			
		}
		
		
	}
}
