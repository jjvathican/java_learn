public class palin
{
public static void main(String[] args)
{
String name="malayala";
int beg=0;
int end=name.length()-1;
System.out.println(name);
while(name.charAt(beg)==name.charAt(end)&&beg<end)
{
beg=beg+1;
end=end-1;
}
if(beg<end)
System.out.println("not palindrom");
else
System.out.println("palindrom");
}
}