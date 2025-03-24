package Thread;

public class oneThread extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("6*"+i+"="+(6*i));
		}
	}
}
