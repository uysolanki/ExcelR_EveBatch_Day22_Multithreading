package washingmachine;

public class WashingMain {

	public static void main(String[] args) throws InterruptedException {
		Soak t1=new Soak();
		Wash t2=new Wash();
		Dry t3=new Dry();
		
		
		t1.start();											//1  Soak1
		t1.join(3000,100);	//join(), join(long ms), join(long ms,int ns)		//2	 Soak2
		t2.start();//infinite time for t1 to complete		//3  Soak3  Wash1
		t2.join();											//4  Soak4  Wash2
		t3.start();											//5  Soak5  Wash3
																	//  Wash4
	}																//  Wash5
																			//Dry1
}
