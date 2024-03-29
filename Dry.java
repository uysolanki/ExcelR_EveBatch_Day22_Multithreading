package washingmachine;

public class Dry extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
			try
		{
		System.out.println("DRY "+i);
		Thread.sleep(1000);
		}
		catch(InterruptedException e1) {}
	}
}
