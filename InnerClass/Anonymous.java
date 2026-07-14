package InnerClass;

abstract class My {
    abstract void display();

}

class Outer {
    public void Meth() {
        My m = new My() {
            public void display() {
                System.out.println("inside Anonymous ");
            }
        };
        m.display();
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Meth();
    }

}
