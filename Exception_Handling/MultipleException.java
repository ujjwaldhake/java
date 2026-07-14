package Exception_Handling;

public class MultipleException {
    public static void main(String[] args) {

        int a[] = { 30, 20, 10, 40, 0 };
        try {

            int c = a[0] / a[4];
            System.out.println(a[3]);

            System.out.println(a[6]);

        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero try again" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);

        }
        System.out.println("BYE");

    }
}
