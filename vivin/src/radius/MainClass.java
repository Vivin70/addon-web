package radius;
import java.io.*;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter radius:");
		Radius a=new Radius();
		int r=s.nextInt();
		a.area(r);
		System.out.println(8%10);
		

	}

}
