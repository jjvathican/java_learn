class primitive
{
	int x,y;
	void getdata(int x1,int y1)
	{
		x=x1;
		y=y1;
		int z=x+y;
		System.out.println("Result is " +z);
		if(x==0)
		{
			System.out.println("X==0");
		}
		else
		{
			System.out.println("X!=0");
		}
	}

	public static void main(String args[])
	{
		boolean flag=true;
		String a="A";
		byte b=2;
		short s=2;
		int i=10;
		long l=555;
		double d=53.14;
		System.out.println("Boolean " +flag);
		System.out.println("String " +a);
		System.out.println("Byte " +b);
		System.out.println("Short " +s);
		System.out.println("Int " +i);
		System.out.println("Long " +l);
		System.out.println("Double " +d);
		primitive ob=new primitive();
		ob.getdata(0,2);
		String name="TESMY";
		boolean r=name instanceof String;
		System.out.println(r);
	}
}