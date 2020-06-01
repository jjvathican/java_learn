import java.util.*;

class Invalid extends Exception
{
Invalid(String s)
{
System.out.println(s);
}
} 

class exception01
{
public static void main(String[] args)throws Invalid
{
try
{

Scanner sc = new Scanner(System.in);
System.out.print("enter_age:");
int age=sc.nextInt();
if(age<18)
{
throw new Invalid("cannot cast"); 
}
else
{
System.out.println("cast your vote");
}


}
catch(InputMismatchException me)
{
System.out.println("invalid input");
}


}
}