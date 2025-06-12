package interface_java;
import java.util.*;



public class java_inter {



	public static void main(String[] args) {
	

		HashMap<String,Integer> stdMk=new HashMap();

		stdMk.put("John", 100);

		stdMk.put("ram",100);

		stdMk.put("hari",50);

		

		int totalMark=0;
		//double avg;

		for(int marks:stdMk.values()) {

			totalMark +=marks;

			

		}

		

		System.out.println("total marks ="+totalMark);
		System.out.println("Total Average="+(totalMark/3));

	}



}

