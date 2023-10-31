ppublic class Th4_a extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello  "+Thread.currentThread().getName()+"\t"+i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class B {
		static void main(String args[])
	{
		Th4 t1=new Th4();
		Th4 t2=new Th4();
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
	}
}


