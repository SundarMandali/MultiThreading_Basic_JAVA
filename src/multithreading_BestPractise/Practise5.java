package multithreading_BestPractise;
class MyThread4 extends Thread
{
	public void run()
	{

		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}
public class Practise5 {
public static void main(String[] args) {
	System.out.println("Default priority of Main Thread"+Thread.currentThread().getPriority());
	MyThread4 t=new MyThread4();
	System.out.println("Default priority of Child Thread"+t.getPriority());
	
	//Changing the priority of only child thread
	t.setPriority(10);
	t.start();
	
	for(int i=0;i<5;i++)
		System.out.println("Main Thread");
	
}
}
