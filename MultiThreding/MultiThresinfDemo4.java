package MultiThreding;

class Resturant {
    boolean isItemAval = false;

    synchronized void order() {
        if (!isItemAval) {
            System.out.println("itemnot available wait for order");
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    synchronized void supplyItem() {
        isItemAval = true;
        System.out.println("item available now");

        notify();
    }
}

class Waiter extends Thread {
    Resturant resturant;

    public Waiter(Resturant resturant) {
        this.resturant = resturant;
    }

    @Override
    public void run() {
        resturant.order();
    }

}

class Chef extends Thread {
    Resturant resturant;

    public Chef(Resturant resturant) {
        this.resturant = resturant;
    }

    @Override
    public void run() {
        resturant.supplyItem();
    }
}

public class MultiThresinfDemo4 {
    public static void main(String[] args) {
        Resturant r = new Resturant();
        Waiter w = new Waiter(r);
        Chef c = new Chef(r);
        w.start();
        c.start();

    }

}
