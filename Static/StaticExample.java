package Static;

class Parent {
    static int x = 10;

    static void show() {
        System.out.println("parent static method");
    }

    static class Inner {
        void innerDisplay() {
            System.out.println("inner method");
        }

    }

}

class Child extends Parent {
    static void show() {
        System.out.println("parent static method");
    }

}

public class StaticExample {
    public static void main(String[] args) {
        Parent p = new System.out.println(Child.x);
        Child.show();
        Parent.Inner pi = new Parent.Inner();
        Child.Inner obj = new Child.Inner();
        Child c = null;
        System.out.println(c.x);

    }

}
