package OOP.Inheritance;

class Super {
    void display() {
        System.out.println("Super");
    }

}

class Sub extends Super {
    void display() {
        System.out.println("Sub");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Super sup1 = new Sub();
        sup1.display();

        Sub sub = new Sub();
        sub.display();
    }

}
