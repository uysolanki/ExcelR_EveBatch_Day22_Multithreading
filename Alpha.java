package day22.multihreading;

public class Alpha implements Runnable {

	@Override
	public void run() {
//		System.out.println("Thread Name for Alpha Thread "+ Thread.currentThread().getName());
//		System.out.println("Thread ID for Alpha Thread "+ Thread.currentThread().getId());
//		System.out.println("Priority for Alpha Thread "+ Thread.currentThread().getPriority());
		for(char a='a';a<='z';a++)
		{
		System.out.println("Alpha Thread : "+ a);
		}
	}

}
