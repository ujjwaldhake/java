package Conditionalstatement;

import java.util.Scanner;

public class Menudriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first NUmber");
        int n=sc.nextInt();
        System.out.println("Enter Second NUmber");
        int n2=sc.nextInt();

        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
                sc.nextLine();   

        
        System.out.println("Enter choice");

        String s = sc.nextLine();
         s=s.toUpperCase();
        switch (s) {
            case "ADD":
                System.out.println(n+n2);
                break;

                case "SUB":
                System.out.println(n-n2);
                break;
                case "MUL":
                System.out.println(n*n2);
                break;
                case "DIV":
                System.out.println(n/n2);
                break;

        
            default:
                 System.out.println("Invalid choice");
                break;
        }{

        }







    }
    
}
