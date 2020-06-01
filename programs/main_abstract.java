interface demo
{
	public void read();
}
interface demo1 extends demo
{
	public void read1();
}
abstract class abstractdemo
{
	abstract void display();
	void show()
	{
		System.out.println("This is a concrete method");
	}
}
class main_abstract extends abstractdemo implements demo,demo1
{
	void display()
	{
		System.out.println("abstract");
	}
	public void read()
	{
	}
	public void read1()
	{
	}
}
class main_class
{
	public static void main(String args[])
	{
		main_abstract ab= new main_abstract();
		ab.display();
		ab.show();
	}
}
