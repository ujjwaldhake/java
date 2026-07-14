package InnerClass;

class Outer {
    void display() {
        class Inner {
            void innerDisplay() {
                System.out.println("local inner ");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocaInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }

}
