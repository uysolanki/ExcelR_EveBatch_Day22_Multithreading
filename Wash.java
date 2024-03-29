package washingmachine;

public class Wash extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
			try
		{
		System.out.println("WASH "+i);
		Thread.sleep(1000);
		}
		catch(InterruptedException e1) {}
	}
}
