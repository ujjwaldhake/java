package Inheritance;

class Abc {
    int a = 30;

    void show() {
        System.out.println("Parent Class MEthod");
    }

}

public class InheritanceDemo1 extends Abc {

    public static void main(String[] args) {
        InheritanceDemo1 obj = new InheritanceDemo1();
        System.out.println(obj.a);
        obj.show();
    }

}
