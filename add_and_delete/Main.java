package loop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		Scanner n=new Scanner(System.in);
		Shape s=new Shape();
	//_shape d=new D_shape();
		
		
		int opt=0;
		System.out.println("Menu");
		while (opt!=5)
		{
			System.out.println("1.Add Shape");
			System.out.println("2.Delete a shape");
			System.out.println("3.list Shape");
			System.out.println("4.exit");
			System.out.println("ener the option:");
			opt=n.nextInt();
			
			if(opt==1)
			{
				//stem.out.println("1");
				s.shapes();
				
			}
			else if(opt==2)
			{
				//stem.out.println("2");
				s.Dshapes();
				
				
			}
			else if(opt==3)
			{
	//System.out.println("3");
				s.display();
				
			}
			else if(opt==4)
			{
				break;
			}
			
		}
	}

}
