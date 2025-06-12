package interface_java;

import java.util.HashMap;

import java.util.Map.Entry;



public class hash {

    public static void main(String[] args) {

        HashMap<String, Integer> mark = new HashMap<>();

        mark.put("Abdul", 100);

        mark.put("Nawas", 70);

        mark.put("Vivin", 80);



        int totalMarks = 0;



        System.out.println("Student Marks:");

        for (Entry<String, Integer> entry : mark.entrySet()) {

            System.out.println(entry.getKey() + " → " + entry.getValue());

            totalMarks += entry.getValue();

        }



        System.out.println("\nTotal Marks: " + totalMarks);



        double average = (double) totalMarks / mark.size();

        System.out.println("Average Marks: " + average);

    }

}