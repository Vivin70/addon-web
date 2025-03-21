package operators;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		arithmetic ar=new arithmetic();
		rational r=new rational();
		System.out.println("enter the a and b value:");
		a=s.nextInt();
		b=s.nextInt();
		ar.add(a, b);
		ar.sub(a, b);
		ar.mul(a, b);
		ar.div(a, b);
		ar.mod(a, b);
		System.out.println("_________________________________________");
		r.eqal(a, b);
		r.GreaterEqal(a, b);
		r.Greater(a, b);
		r.LesserEqal(a, b);
		r.Lesser(a, b);
		r.NOTeqal(a, b);
		}

}
