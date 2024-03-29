package synchronization;

public class BankMain {

	public static void main(String[] args) {
		Bank b1=new Bank();
		System.out.println(b1.getBalance());
		Son thread1=new Son(b1);
		thread1.start();
		Father thread2=new Father(b1);
		thread2.start();
	}

}
