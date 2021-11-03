package multithreading_BestPractise;

class MyThread1 extends Thread
{
	
	public void run()
	{
		
			System.out.println("Name of this thread is "+Thread.currentThread().getName());
	}
}
public class Practise3 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	
	// changing name of main thread to "Sundar"
	Thread.currentThread().setName("Sundar");
	System.out.println(Thread.currentThread().getName());
	
	Thread t=new Thread();
	Thread t1=new Thread();
	System.out.println(t.getName());
	System.out.println(t1.getName());
	
	//naming the thread while creating the thread
	Thread t2=new Thread("Rohith");
	System.out.println(t2.getName());
	
	MyThread1 obj=new MyThread1();
	obj.start();
	
}
}
