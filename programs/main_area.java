class area{
void area(float r)
{
double ar=3.14*r*r;
  System.out.println("Area of circle"+ar);
}
void area(int a1){
 System.out.println("Area of square"+a1*a1);
}
void area(float l,float b){
  System.out.println("Area of rectangle"+l*b);
}
void area(double r2){
 double ar=4*3.14*r2*r2;
 System.out.println("Area of sphere"+ar);
}
} 

class main_area{
public static void main(String args[])
{
 area ob=new area();
 ob.area(2.5);
 ob.area(4);
 ob.area(4,3);
 ob.area(40.0);
}} 