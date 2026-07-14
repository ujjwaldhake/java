package InnerClass;

import InnerClass.Outer.Inner;

class Outer {
    int x = 10;
    Inner i = new Inner();

    public class Inner {

        int y = 20;

        void innerDisplay() {
            System.out.println("outer " + x);
        }
    }

    void outerDisplay() {
        i.innerDisplay();
        System.out.println(i.y);

    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

    }

}
