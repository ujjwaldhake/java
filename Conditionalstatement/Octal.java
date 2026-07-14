package Conditionalstatement;

import java.util.Scanner;

public class Octal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String s = sc.next();
        if (s.matches("[01]+")) {
            System.out.println(s + " is Binary Number");
        } else if (s.matches("[0-7]+")) {
            System.out.println(s + " octal Number");
        } else if (s.matches("[0-9]+")) {
            System.out.println(s + " Decimal Number");
        } else if (s.matches("[0-9A-F]+")) {
            System.out.println(s + " Hexadecimal Number");
        } else {
            System.out.println("Not a number");
        }

    }

}
