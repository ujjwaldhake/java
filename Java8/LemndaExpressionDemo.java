package Java8;

interface calculator {
    double operation(int a, int b);

    default void printInfo() {
        System.out.println("This is default method");
    }

    static void typeOfOperation() {
        System.out.println("ststic content : ARITHMETIC OPERATION");

    }

}

public class LemndaExpressionDemo {
    public static void main(String[] args) {
        calculator cl = (int a, int b) -> {
            return a * b;
        };

        calculator cl1 = (a, b) -> a + b;

        System.out.println(cl.operation(10, 20));
        System.out.println(cl1.operation(10, 20));
        cl.printInfo();
    }

}
