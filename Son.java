package synchronization;

public class Son extends Thread
{
	Bank b1;
	public Son(Bank b1)
	{
		this.b1=b1;
	}
	public void run()
	{
		b1.withdraw(5000);
	}
}
