package multithreading_BestPractise;


class MyThread extends Thread
{
	public void start()
	{
		super.start();
//		for(int i=1;i<=10;i++)
			System.out.println("new  Thread is not created");
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Child Thread");
	}
}

public class Practise1 {
public static void main(String args[]) {
	MyThread t=new MyThread();
	t.start();
	for(int i=1;i<=10;i++)
		System.out.println("Main Thread");
//	t.start();
}
}
