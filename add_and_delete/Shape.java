package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shape  {
	 List<String> list = new ArrayList<>();
	public void shapes()
	{
		int opt=0;
		
		 
		

		
		Scanner n=new Scanner(System.in);
		while(opt!=5)
		{
			System.out.println("1.circle");
			System.out.println("2.square");
			System.out.println("3.rect");
			System.out.println("4.triangle");
			System.out.println("5.Exit");
			System.out.println("enter the shape no:");
			opt=n.nextInt();
			if(opt==1)
			{
				System.out.println("circle added");
				list.add("circle");
			}
			else if(opt==2)
			{
				System.out.println("Square added");
				list.add("Square");
			}
			else if(opt==3)
			{
				System.out.println("rect added");
				list.add("Recteangle");
			}
			else if(opt==4)
			{
				System.out.println("triangle added");
				list.add("Triangle");
			}
			else if(opt==5)
			{
				System.out.println("exit");
			}
			
			
			
		}
		
	}
	
		public void Dshapes()
		{
			int opt=0;
			
			
			
			Scanner n=new Scanner(System.in);
			while(opt!=5)
			{
				System.out.println("_____________________________________");
				System.out.println("1.circle");
				System.out.println("2.square");
				System.out.println("3.rect");
				System.out.println("4.triangle");
				System.out.println("5.Exit");
				System.out.println("enter the shape no:");
				opt=n.nextInt();
				if(opt==1)
				{
					System.out.println("circle delted");
					list.remove("circle");
					
					
				}
				else if(opt==2)
				{
					System.out.println("Square deleted");
					list.remove("Square");
				}
				else if(opt==3)
				{
					System.out.println("rect deleted");
				}
				else if(opt==4)
				{
					System.out.println("triangle deleted");
				}
				else if(opt==5)
				{
					
					break;
				}
				
				
				
			}
			
		}

	 public void display()
		{
		 for (String number : list) {
	            System.out.println("__________ " + number+"____________");
		}
		

		}
}
	 

