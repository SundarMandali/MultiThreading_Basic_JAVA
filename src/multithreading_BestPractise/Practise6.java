package multithreading_BestPractise;



class MyThread5 extends Thread
{
	public void run()
	{

		for(int i=0;i<5;i++)
		{	
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class Practise6 {
public static void main(String[] args) throws InterruptedException {
	MyThread5 t=new MyThread5();
	t.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("Main Thread");
	}
}
}
