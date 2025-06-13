package Strings;

import java.util.Scanner;

class StrRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String o = scanner.nextLine();
        String rev= "";

        for (int i = o.length() - 1; i >= 0; i--) {
            rev += o.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
        scanner.close();
    }
}
