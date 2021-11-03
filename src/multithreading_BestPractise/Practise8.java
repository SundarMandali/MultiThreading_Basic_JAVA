package multithreading_BestPractise;

class MyThread8 extends Thread 
{
	static Thread mt;
	public void run() 
	{
		
			try {
				mt.join();//child thread waiting for main thread to complete the execution
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}

public class Practise8 {
public static void main(String[] args) throws InterruptedException {
	MyThread8.mt=Thread.currentThread();
	MyThread8 t=new MyThread8();
	t.start();
//	t.join();
	for(int i=0;i<5;i++) {
		System.out.println("Main Thread");
		Thread.sleep(2000);
}
}
}
