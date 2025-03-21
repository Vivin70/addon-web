package BasicProgram;
import java.util.Scanner;

public class GreatOf3 {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no a b c:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c )
			System.out.println("a is greater");
		else if(b>a && b>c)
			System.out.println("b is greatest");
		else if(c>a && c>b)
			System.out.println("c is greatest");
		
				
	}

}
