package synchronization;

public class Bank {
		private double balance;
		
		public Bank()
		{
			this.balance=1000;
		}
		public Bank(double balance)
		{
			this.balance=balance;
		}
		public double getBalance()
		{
			return this.balance;
		}
		
		
		public synchronized void withdraw(double wAmt)  //5000
		{
			if(this.balance<wAmt)
			{
				System.out.println("InSufficient Funds "+ getBalance());  //1000
				try 
				{
					wait();
					Thread.sleep(2000);
				} 
				catch (InterruptedException e)	{}
				System.out.println("Balance After TopUp" + getBalance());  //6000
				this.balance=this.balance-wAmt;
				System.out.println("Balance After Withdawal" + getBalance()); //1000
			}
		}
		
		public synchronized void deposit(double dAmt)  //5000
		{
			this.balance=this.balance+dAmt;
			notify();
		}
		
}
