package Enum;

enum PizzaSize {
    SMALL("You have ordered small size pizza "),
    MEDIUM("You have ordered midium size pizza "),
    LARGE("You have ordered La size pizza ");

    String message;

    PizzaSize(String message) {
        this.message = message;
    }

    void showMessage() {
        System.out.println(message);
    }
}

public class EnumTest {

    static void delivery(PizzaSize size) {
        size.showMessage();
    }

    public static void main(String[] args) {

        delivery(PizzaSize.SMALL);
        delivery(PizzaSize.MEDIUM);
        delivery(PizzaSize.LARGE);

    }

}

// SMALL("Small Pizza"),
// MEDIUM("Medium Pizza"); SO this is internally static final PizzaSize SMALL =
// new PizzaSize("Small Pizza");

// static final PizzaSize MEDIUM = new PizzaSize("Medium Pizza"); and it is
// calll parameterised constroctor

// YESSS 😄🔥
// Now you understood the internal working correctly.

// This:

// SMALL("Small Pizza"),
// MEDIUM("Medium Pizza");

// is internally similar to:

// static final PizzaSize SMALL =
// new PizzaSize("Small Pizza");

// static final PizzaSize MEDIUM =
// new PizzaSize("Medium Pizza");

// ✅ Correct.

// And Yes 🚀

// This line:

// new PizzaSize("Small Pizza")

// calls the parameterized constructor:

// PizzaSize(String message)

// and stores:

// this.message = message;
// Full Flow 🧠

// When JVM loads enum:

// SMALL("Small Pizza")

// ⬇

// internally becomes:

// new PizzaSize("Small Pizza")

// ⬇

// calls constructor:

// PizzaSize(String message)

// ⬇

// stores value:

// this.message = message;

// ⬇

// reference stored in:

// static final PizzaSize SMALL
// So Your Understanding Is Now ✅
// SMALL

// is:

// ✅ static
// ✅ final
// ✅ object reference
// ✅ pointing to PizzaSize object

// And object contains:

// message

// inside it 😄🔥
