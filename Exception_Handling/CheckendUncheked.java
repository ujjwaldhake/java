package Exception_Handling;

import java.io.FileInputStream;

public class CheckendUncheked {
    static void fun1() {
        // try {
        // System.out.println(10/0);//not checked by complier because Arithmatic
        // Exception

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // e.printStackTrace();
        // }
        // FileInputStream fl = new FileInputStream(""); checked exception must handel
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }

}
