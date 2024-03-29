package synchronization;

public class Father extends Thread {
	Bank b1;
	public Father(Bank b1)
	{
		this.b1=b1;
	}
	
	public void run()
	{
		b1.deposit(5000);
	}
}
