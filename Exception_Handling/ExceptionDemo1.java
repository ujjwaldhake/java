package Exception_Handling;

import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter two number");

        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero try again" + e);
        }

        System.out.println("BYE");

    }

}
