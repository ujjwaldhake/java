package Interface;

//interfaces are used to only used for overriding and it is only pm
interface Test {

    void meth1();

    void meth2();

}

class My implements Test {

    @Override
    public void meth1() {
        System.out.println("meth1 of class my");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of class my");

    }

    public void meth3() {
        System.out.println("meth3  of class my");

    }

}

public class Interface1 {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
        ((My) t).meth3();
    }

}
