public class array
{
	public static void main(String args[])
	{
		double[] a={1,1.2,0.5,4,5};
		int i;
		double min;
		min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}