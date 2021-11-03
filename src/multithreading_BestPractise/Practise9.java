package multithreading_BestPractise;

public class Practise9 {
public static void main(String[] args) throws InterruptedException {
	for(int i=0;i<5;i++)
	{
		System.out.println("Main Thread");
		Thread.sleep(2000);
	}
}
}
