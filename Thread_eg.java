package interface_java;
class Sample extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++) {
			System.out.println("the out put:"+i);
		}
	}
	
}
class sample2 extends Thread{
	public void run() {
		for(int i=11; i<=20;i++) {
			System.out.println("the out put: "+i);
		}
	}
}

public class thread_eg {
	public static void main (String args[])
	{
		Sample s=new Sample();
		sample2 s1=new sample2();
		s1.start();
		s.start();
		
	}

}
