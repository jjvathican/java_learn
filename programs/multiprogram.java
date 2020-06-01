import java.lang.Thread;
class mythread extends Thread
{
public void run()
{
int i;
for(i=0;i<5;++i)
{
try
{
System.out.println(i);
Thread.sleep(10);
}
catch(InterruptedException me)
{

}
}
System.out.println(mythread.currentThread());
}
}


class mythread1 extends Thread
{
public void run()
{
int i;
for(i=0;i<5;++i)
{
System.out.println(i);
}
}
}


class multiprogram
{
public static void main(String[] args)
{
mythread t1=new mythread();
mythread t2=new mythread();
t1.setName("jerin");
t1.start();
t2.setName("jose");
t2.start();
System.out.println(Thread.currentThread());
}
}