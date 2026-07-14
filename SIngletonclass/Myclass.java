package SIngletonclass;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("object created ");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Myclass {
    public static void main(String[] args) {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();

        System.out.println(i1.equals(i2));

        int a1 = 10;
        int b2 = 10;

    }

}
