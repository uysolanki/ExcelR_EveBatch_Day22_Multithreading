package day22.multihreading;

public class Numeric extends Thread {
	
	public Numeric() {}
	public Numeric(String threadName)
	{
		super(threadName);
	}
	
	
	public void run()
	{
//		System.out.println("Thread Name for Numeric Thread "+ Thread.currentThread().getName());
//		System.out.println("Thread ID for Numeric Thread "+ Thread.currentThread().getId());
//		System.out.println("Priority for Numeric Thread "+ Thread.currentThread().getPriority());
		
		for(int i=1;i<=26;i++)
		{
			System.out.println("Numeric Thread : "+ i);	
		}
	}

}
