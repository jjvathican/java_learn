import java.io.*;
class simple
{
	public static void main(String args[])
	{
		try
		{
			InputStreamReader s=new InputStreamReader(System.in);
			System.out.println("enter the character");
			char ch=(char)s.read();
                        System.out.println("entered character is" +ch);
		}
		catch(IOException e)
		{
			System.out.println("exception");
		}	
	}
}