package Java8;

@FunctionalInterface
interface Calculate {
    void printName();
    // we can any number of static and defauld method in functional interface

}

public class FunctionalINterfaceDemo {
    // old implementation
    // @Override
    // public void printName() {
    // System.out.println("THis is camel company cancy");
    // }
    public static void main(String[] args) {
        Calculate cal = () -> {
            System.out.println("This is cal Company");
        };
        cal.printName();
        Calculate cal1 = () -> {
            System.out.println("This is cal1 Company");
        };
        cal1.printName();

    }
}

// class InnerFunctionalINterfaceDemo {
// public static void main(String[] args) {
// Calculate cals = new FunctionalINterfaceDemo();
// cals.printName();
// }

// }
