public class count
{
public static void main(String[] args)
{
String name=" malayala is a good language ";
char ch[]=name.toCharArray();
int i=0;
int count=0;
try
{

while(ch[i]==' ')
{
i=i+1;
}

if(ch[i]!=' ')
count=count+1;

while(ch[i]!=' ')
{
i=i+1;
}

}
catch
{
System.out.println(count);
}
finally
{}
}
}