package Java8;

interface ConvertToUpperCase {
    String converToUpperCase(String value);

}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        ConvertToUpperCase upperCase = (value) -> {
            System.out.println("inside Lenda expression : converting to uppercase");
            return value.toUpperCase();
        };
        System.out.println(upperCase.converToUpperCase("Java Method Reference"));
        // Method Reference
        // re using excutiong a pre defined methd form strin class
        // assigning that method reference of class
        // If an existing method can provide the implementation required by the single
        // abstract method (SAM)
        // of a functional interface, you can use a method reference instead of writing
        // the Lambda.
        ConvertToUpperCase upperCaseTwo = String::toUpperCase;
        System.out.println(upperCaseTwo.converToUpperCase("ujjjwal"));
        //

    }

}
