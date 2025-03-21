package array_in_java;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Two_d {
	Scanner in=new Scanner(System.in);
	 int[][] a = new int[3][3];
	
	void get() {
		System.out.println("enter value");
		
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
			{
				a[i][j]=in.nextInt();
			}
	}
	void display() {
		for(int i=0;i<=2;i++)
		{
			System.out.println();
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]);
				
					
			}
	}

}
}
