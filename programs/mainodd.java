class number
{
	void input(int n)
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
class mainodd
{
	public static void main(String args[])
	{
		number ob= new number();
		ob.input(4);
	}
}