import java.io.*;
class inputstream
{
public static void main(String[] args)
{
try
{
InputStreamReader input=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(input);
char a =(char) br.read();
System.out.println(a);
}
catch(IOException me)
{

}
}
}