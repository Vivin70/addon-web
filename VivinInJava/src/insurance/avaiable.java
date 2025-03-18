package insurance;

import java.util.Scanner;

public class avaiable {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the marrital Status:");
		String ms=s.nextLine();
		if (ms.equals("married"))
		{
			System.out.println("eligable for insurance");
		}
		else
		{
			System.out.println("enter the gender:");
			String g=s.next();
			if(g.equals("male"||"female"))
			{
				System.out.println("enter the age:");
				int age=s.nextInt();
				if(g.equals("male"))
				{
				if(age>=30)
					System.out.println("eligiable for insurance");
				else
					System.out.println("not eligable");
		}
			 if(g.equals("female"))
			{

				System.out.println("enter the age:");
			
				if(age>=25)
					System.out.println("eligiable for insurance");
				else
					System.out.println("not eligable");
				
			}
			else
			{
				System.out.println("invalid user input");
			}
				
			}
				
		
	}

}
