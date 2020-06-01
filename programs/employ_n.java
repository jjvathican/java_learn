interface emp
{
 void emp1();

}



abstract class employ
{
void display1()
{
System.out.println("non static inside employ");
}
abstract void show();

}

class newClass
{
}


class programmer extends employ implements emp
{
void display1()
{
System.out.println("non static inside programmer");
}
void show()
{
System.out.println("ovverrided abstract method");
}
public void emp1()
{
System.out.println("interface in programmer");
}
}

class employ_n
{
public static void main(String args[])
{
programmer even=new programmer();

even.display1();
even.show();

}
}