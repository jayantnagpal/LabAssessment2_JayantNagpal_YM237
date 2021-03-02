package labassessment2_q2;

import java.util.Random;

public class NumberRandomizer implements Runnable {
	int num;
	Random random=new Random();
	
	public void run() {
		num=random.nextInt(10)+1;
	}

	public int getNum() {
		return num;
	}
	
	public static void main(String[] args) throws InterruptedException {
		NumberRandomizer numberRandomizer1=new NumberRandomizer();
		NumberRandomizer numberRandomizer2=new NumberRandomizer();
		NumberRandomizer numberRandomizer3=new NumberRandomizer();
		NumberRandomizer numberRandomizer4=new NumberRandomizer();
		NumberRandomizer numberRandomizer5=new NumberRandomizer();
		
		Thread thread1=new Thread(numberRandomizer1);
		Thread thread2=new Thread(numberRandomizer2);
		Thread thread3=new Thread(numberRandomizer3);
		Thread thread4=new Thread(numberRandomizer4);
		Thread thread5=new Thread(numberRandomizer5);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();
		
		System.out.println("Generated numbers are: ");
		System.out.println(numberRandomizer1.getNum()+" "+numberRandomizer2.getNum()+" "+numberRandomizer3.getNum()+" "+numberRandomizer4.getNum()+" "+numberRandomizer5.getNum()+" ");
		
		int sum=0;
		sum=numberRandomizer1.getNum()+numberRandomizer2.getNum()+numberRandomizer3.getNum()+numberRandomizer4.getNum()+numberRandomizer5.getNum();
		System.out.println("Sum: "+sum);
	}
	

}
