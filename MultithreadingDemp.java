package day22.multihreading;

public class MultithreadingDemp {

	public static void main(String[] args) {
		
		Numeric t1=new Numeric("ThreadNum"); //Thread-0 , Priority 5
		Alpha t2=new Alpha();
		
		t1.start();
		
		Thread tx=new Thread(t2,"NumbersAlpha"); //Thread-1 , Priority 5
		tx.start();
		
		
	}

}
