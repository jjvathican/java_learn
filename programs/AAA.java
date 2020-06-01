public class AAA
{

int a;

AAA(int x)
{
a=x;
} 


boolean equals(AAA ob)
{
if(a==ob.a)
{
return true;
}
  return false;
}
  

public static void main(String[] args)
{
AAA ob1 = new AAA(100);
AAA ob2 = new AAA(150);
System.out.println(ob1.equals(ob2));
}

}