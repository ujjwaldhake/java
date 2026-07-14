package OOP.Inheritance;

class Super {
    public void meth1() {
        System.out.println("Sup Meth1");
    }

    public void meth2() {

        System.out.println("Sup Meth2");
    }

}

class Sub extends Super {
    public void meth2() {

        System.out.println("Sub Meth2");
    }

    public void meth3() {

        System.out.println("Sub Meth3");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super sup = new Sub();
        sup.meth1();
        sup.meth2();
        ((Sub) sup).meth3();
    }
}
