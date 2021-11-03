package multithreading_BestPractise;

class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("In Child Thread priority is"+Thread.currentThread().getPriority());
	}
}
public class Practise4 {
public static void main(String[] args) {
	System.out.println("Default Priority"+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(8);
	MyThread3 t=new MyThread3();
	System.out.println("In main function"+t.getPriority());
	t.start();
	System.out.println("In main function"+t.getPriority());
}
}
