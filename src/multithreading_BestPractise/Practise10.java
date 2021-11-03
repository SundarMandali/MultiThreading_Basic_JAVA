package multithreading_BestPractise;

class MyThread10 extends Thread
{
	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
			Thread.sleep(2000);
		}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Practise10 {
public static void main(String[] args) {
	
	MyThread10 t=new MyThread10();
	t.start();
	t.interrupt();//Interrupts the sleep method in child thread
	
	for(int i=0;i<5;i++)
		System.out.println("Main Thread");
}
}
