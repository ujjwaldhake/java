package Java8;

interface InterfaceDefaultMethodDemo {
    void printName();

    String getName();

    default void defaultMethodOne() {
        System.out.println("inside defaultMethodOne");
    }

    default String defaultMethodtwo() {
        System.out.println("inside defaultMethodOne");
        return "defaultMethodtwo";
    }

}

public class DefaultMethodDemo implements InterfaceDefaultMethodDemo {

    @Override
    public void printName() {
        System.out.println("Printing name ");

    }

    @Override
    public String getName() {
        System.out.println("Printing name ");
        return "Default method";
    }

    public static void main(String[] args) {
        DefaultMethodDemo d = new DefaultMethodDemo();
        d.defaultMethodOne();
        d.defaultMethodtwo();
        d.printName();
        System.out.println(d.getName());
    }

}

class DefaultMethodDemo22 implements InterfaceDefaultMethodDemo {

    @Override
    public void printName() {
        System.out.println("Printing name ");

    }

    @Override
    public String getName() {
        System.out.println("Printing name ");
        return "Default method";
    }

    public static void main(String[] args) {
        DefaultMethodDemo22 d = new DefaultMethodDemo22();
        d.defaultMethodOne();
        d.defaultMethodtwo();
        d.printName();
        System.out.println(d.getName());
    }

}
