package SIngletonclass;

class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine coffeemachineInstance = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
    }

    public void fillCoffeBeans() {
        System.out.println("coffeeBeans Filling");
    }

    public void fillWater() {
        System.out.println("Water filling ");

    }

    public static CoffeeMachine getcoffeemachineInstance() {
        if (coffeemachineInstance == null) {
            coffeemachineInstance = new CoffeeMachine();
        }
        return coffeemachineInstance;

    }

}

public class MyCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine i1 = CoffeeMachine.getcoffeemachineInstance();
        CoffeeMachine i2 = CoffeeMachine.getcoffeemachineInstance();

    }

}
