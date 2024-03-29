package day22.multihreading;

public class DeadLockExample {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("I am in Thread : "+Thread.currentThread().getName());
	Thread.currentThread().join();
	System.out.println("This is Unreachable code"); 
}
}
