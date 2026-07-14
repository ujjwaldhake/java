package Enum;

enum PizzaSize {

    SMALL("You ordered small pizza"),
    MEDIUM("You ordered medium pizza"),
    LARGE("You ordered large pizza");

    String message;

    PizzaSize(String message) {
        this.message = message;
    }

    void showMessage() {
        System.out.println(message);
    }
}

public class EnumTest1 {

    public static void main(String[] args) {

        PizzaSize.SMALL.showMessage();
        PizzaSize.MEDIUM.showMessage();
        PizzaSize.LARGE.showMessage();
    }
}