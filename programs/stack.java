public class stack
{
int ab[]=new int[10];
public int i=-1;

void push(int num)
{
i=i+1;
ab[i]=num;
}
void pop()
{
i=i-1;
}
void display()
{
int j;

for(j=0;j<=i;++j)
{
System.out.print(ab[j]+" ");
}
}
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int b[]={4,5,6};
int i;
stack ob=new stack();
stack ob1=new stack();
System.out.println("stack 1 is entered");
for(i=0;i<a.length;++i)
{
ob.push(a[i]);
}
System.out.println("stack 2 is entered");
for(i=0;i<b.length;++i)
{
ob1.push(b[i]);
}
System.out.print("stack 1 :");
ob.display();
System.out.println();
System.out.print("stack 2 :");
ob1.display();
System.out.println();
System.out.println("deleting  elements");
ob.pop();
ob1.pop();
System.out.print("stack 1 :");
ob.display();
System.out.println();
System.out.print("stack 2 :");
ob1.display();
System.out.println();
if(ob.ab[ob.i]<ob1.ab[ob1.i])
{
System.out.println(ob.ab[ob.i]+" is less than "+ob1.ab[ob1.i]);
}
else if(ob.ab[ob.i]>ob1.ab[ob1.i])
{
System.out.println(ob1.ab[ob.i]+" is less than "+ob1.ab[ob1.i]);
}
else
{
System.out.println(ob1.ab[ob.i]+" is equal to "+ob1.ab[ob1.i]);
}
}
}