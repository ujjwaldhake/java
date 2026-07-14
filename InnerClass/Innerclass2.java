package InnerClass;

class Outer2 {
    int x = 10;

    class Inner2 {
        int y = 20;

        void innerDisplay() {

            System.out.println("Inside inner class Display method ");
            System.out.println("x :" + x);
            System.out.println("y :" + y);

        }
    }

    void outerDisplay() {
        System.out.println("Inside Outer class Display method ");
        System.out.println("x ;" + x);
        Inner2 i = new Inner2();

        i.innerDisplay();

    }

}

public class Innerclass2 {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.outerDisplay();
        System.out.println("...........................................................");
        Outer2.Inner2 oi = new Outer2().new Inner2();
        oi.innerDisplay();
    }
}
