package Java8;

@FunctionalInterface
interface CalcOperator {
    double operation(int a, int b);

    default void printInfo() {
        System.out.println("This is default method");
    }

    static void typeOfOperation() {
        System.out.println("ststic content : ARITHMETIC OPERATION");

    }

}

public class FunctionalINterfaceDemo2 {
    public static void main(String[] args) {
        CalcOperator addition = (int a, int b) -> {
            return a + b;
        };
        // execution lembda expression notetion
        System.out.println(addition.operation(10, 12));

    }

}
