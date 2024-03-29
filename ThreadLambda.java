package day22.multihreading;

public class ThreadLambda {
public static void main(String[] args) {
	
	Thread t1=new Thread(
			()->
			{
				System.out.println("Thread Name for Alpha Thread "+ Thread.currentThread().getName());
				System.out.println("Thread ID for Alpha Thread "+ Thread.currentThread().getId());
				System.out.println("Priority for Alpha Thread "+ Thread.currentThread().getPriority());
				
				for(int i=1;i<=5;i++)
				{
					System.out.println("Lambda Thread : "+ i);	
				}
			},"MyLambdaThread");
	
	t1.start();
	
	while(true)
	{
		Thread.State state=t1.getState();
		System.out.println(state);
		if(state==Thread.State.TERMINATED)
			break;
	}
}
}
