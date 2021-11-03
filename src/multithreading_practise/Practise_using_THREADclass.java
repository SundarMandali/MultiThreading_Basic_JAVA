package multithreading_practise;

 class A extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("1st thread");
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class B extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("2nd thread");
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}

public class Practise_using_THREADclass {
	public static void main(String args[])
	{
A obj1=new A();
B obj2=new B();
obj1.start();
try{Thread.sleep(10);}catch(Exception e){};
obj2.start();
}
}
