package Exception_Handling;

class NegativeDimentionException extends Exception {
    public String toString() {
        return "Dinemtion of a Reactangle cannot be negative ";
    }
}

public class TrowMain {

    static int area(int l, int b) throws NegativeDimentionException {

        if (l < 0 || b < 0)
            throw new NegativeDimentionException();
        return l * b;
    }

    static void meth1() throws NegativeDimentionException {
        System.out.println("Ärea is " + area(-10, 5));
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (NegativeDimentionException e) {
            System.out.println(e.toString());
        }
    }

}
