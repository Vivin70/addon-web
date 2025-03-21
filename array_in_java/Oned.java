package array_in_java;
import java.util.*;
public class Oned 
{
	
	Scanner in=new Scanner(System.in);	
	 int[] a = new int[10];
		
		
		 void get() {
			 System.out.println("enter value:");
			for(int i=0;i<=4;i++)
			{
				a[i]=in.nextInt();
			}
		}
		void display() {
			for(int i=0;i<=4;i++)
				
			{
				System.out.print(a[i]);
			}
		}

}
	
	


