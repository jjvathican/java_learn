public class Findsum
{
	public static void main(String args[])
	{
		int[] number=new int[10];
		int i;
		
		for(i=0;i<10;i++)
		System.out.println("number[5]");
		int sum= find_sum(number);
		System.out.println("The Sum is"+sum+".");
	}
	public static int find_sum(int[] value)
	{
		int i,total=0;
		for(i=0;i<10;i++)
		{
			total=total+value[i];
		}
		return(total);
	}
}