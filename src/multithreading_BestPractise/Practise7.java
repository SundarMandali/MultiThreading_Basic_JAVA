package multithreading_BestPractise;

class MyThread6 extends Thread
{
	public void run()
	{

		for(int i=0;i<5;i++)
		{	
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


public class Practise7 {
public static void main(String[] args) throws InterruptedException {
	MyThread6 t=new MyThread6();
	t.start();
	t.join(1000);//Main thread waiting for child thread to complete the execution
	for(int i=0;i<5;i++)
	{
		System.out.println("Main Thread");
	}
}
}
