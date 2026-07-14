package Exception_Handling;

public class FinallyDemo {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 5);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Final message ");

        }
    }

}
