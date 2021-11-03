package multithreading_practise;
class A1 implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("1st thread");
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class B1 implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("2nd thread");
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
public class Practise_using_RunnableInterface {
	public static void main(String args[])
	{
		
	
	Runnable obj1=new A1();
	Runnable obj2=new B1();
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	try {Thread.sleep(10);}catch(Exception e) {}
	t2.start();
	}

}
