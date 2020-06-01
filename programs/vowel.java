import java.io.*
class vowel
{
	public static void main(String args[])
	{
		try
		{
			InputStreamReader s=new InputStreamReader(System.in);
			System.out.println("Enter the character");	
			char ch=(char)s.read();
			if(char ch=="a"||ch=="A"||ch=="e"||ch=="E"||ch=="i"||ch=="I"||ch=="o"||ch=="O"||ch=="u"||ch=="U")
			{
				System.out.println("vowel"+ch);
			}
			else
			{
				System.out.println("not vowel"+ch);
			}
		}
		catch(IOException i)
		{
			System.out.println("IOException caught");
		}
	}
}