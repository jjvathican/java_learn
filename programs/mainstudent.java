class student 
{
	String name;
	int rollno;
	 
	void get(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println("TESMY,24");
	}
}
class mainstudent
{	
	public static void main(String args[])
	{
		student s1=new student();
		s1.display();
	}
}	
	