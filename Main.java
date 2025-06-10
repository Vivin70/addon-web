package day3;
import java.util.Scanner;
class SIB
{
	public int total;
	Scanner s=new Scanner(System.in);
	
	void ac()
	{
	
		Scanner s=new Scanner(System.in);
		String acn;
		System.out.println("account holder name:Vivin");
		System.out.println("account balance:"+total);
		
		
		
		
	}
	void withdraw()
	{
		int balance,draw;
		Scanner s=new Scanner(System.in);
		System.out.println("the amount you want to with draw:");
		draw=s.nextInt();
		balance=total-draw;
		total=balance;
		System.out.println("the balance is :"+total);		
	}
	void deposit()
	{
		int dep;
		Scanner s=new Scanner(System.in);
		System.out.println("the money deposited:");
		dep=s.nextInt();
		total=total+dep;
		System.out.println("the balance:"+total);
	}
}

public class Main {

	public static void main(String args[])
	{
		SIB sib=new SIB();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the total amount:");
		//int ch
		sib.total=s.nextInt();
		//int opt=s.nextInt();
		while(true){
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.acount detial");
		System.out.println("4.exit");
		System.out.println("enter the opyion:");
		int opt=s.nextInt();
		if(opt==1)
			sib.withdraw();
		else if(opt==2)
			
			sib.deposit();
		else if (opt==3)
			sib.ac();
		else 
			System.out.println("exited");
			break;
			
		
	
	}
}
}
