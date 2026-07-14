package Exception_Handling;

public class NastedCatch {
    public static void main(String[] args) {

        int a[] = { 30, 20, 10, 40, 0 };
        try {

            int c = a[0] / a[4];
            System.out.println(a[3]);
            try {

                System.out.println(a[6]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is invalid " + e);

            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero try again" + e);
        }
        System.out.println("BYE");

    }
}
