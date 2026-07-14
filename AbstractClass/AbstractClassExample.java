package AbstractClass;

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void Meth1() {
        System.out.println("meth1 of super");
    }

    abstract public void meth2();

}

class Sub extends Super {

    @Override
    public void meth2() {
        System.out.println("meth2 of sub");

    }

    public void meth3() {
        System.out.println("meth3 of sub");

    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth2();
        s.Meth1();
        ((Sub) s).meth3();

    }
}
