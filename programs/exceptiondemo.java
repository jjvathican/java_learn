import java.util.*;
class myexception extends Exception
{
	myexception(String s)
	{
		System.out.println(s);
	}
}
class exceptiondemo
{
	public static void main(String args[]) throws myexception
	{
		Thread t=new Thread();
		System.out.println(t.currentThread());
		Scanner a=new Scanner(System.in);
		int age= a.nextInt();
		System.out.println("age is "+age);
		if(age<18)
		{
			throw new myexception("Sorry invalid");
		}
		else
		{
			System.out.println("valid age");
		}
	}
}