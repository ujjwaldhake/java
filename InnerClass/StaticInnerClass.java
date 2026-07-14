package InnerClass;

class Outer {
    int x = 10;
    static int y = 20;
    static Outer o = new Outer();

    static class Inner {

        void display() {
            System.out.println(o.x);
            System.out.println(y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.display();
    }

}
