class mythread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=5;i>=0;i--)
			{
				System.out.println(i);
				mythread.sleep(1000);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("thread interrupted"); 
		
		}
	}
		public static void main(String args[])
		{
		
			mythread m1=new mythread();
			m1.start();
			m1.setName("mythread");
			System.out.println(Thread.currentThread());
		}
}