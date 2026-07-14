package Static;

class Test {
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
}

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main");
        Test t = new Test();

    }

}
