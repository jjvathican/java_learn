class add
{
 int a,b;
 int c;

 void getdata(int x, int y,int z)
 {
  a=x;
  b=y;
  c=x+y;
 }
 void putdata()
{
 System.out.printl(a,b)
}
}
class main_add
{
 public static void main(string args[])
 { 
 add s1=new add();
 s1.getdata(10,15);
 s1.putdata();
 }
} 