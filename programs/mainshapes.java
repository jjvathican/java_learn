package shapes;
class square
{
	private int a=10;
	protected int b=20;
	square()
	{
		

			System.out.println("Square is created");
			System.out.println("Square value"+a);
			System.out.println(+b);
	}
}
public class rectangle
{
	rectangle()
	{
		System.out.println("Rectangle is created");
	}
}

class mainshapes
{
	public static void main(String[] args)
	{
		square s1=new square();
		//System.out.println(s1.a);
		System.out.println(s1.b);
	}
}