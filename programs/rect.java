class rect{
double l,b;
rect(double l,double b)
{
 this.l=l;
 this.b=b;
}
void area()
{
 double area=l*b;
 System.out.println(area);
}
public static void main(String args[])
{
 rect r=new rect(20,10);
 r.area();
}
} 