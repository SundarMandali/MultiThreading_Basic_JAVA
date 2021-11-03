package multithreading_BestPractise;
class MyThread11 extends Thread
{
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
			
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
public class Practise11 {
	public static void main(String[] args) {
		
		MyThread11 t=new MyThread11();
		t.start();
		t.interrupt();//Interrupts the sleep method in child thread
		
		for(int i=0;i<5;i++)
			System.out.println("Main Thread");
	}
}
