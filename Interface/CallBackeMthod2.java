package Interface;

interface Member {
    void callbak();
}

class Store {
    Member mem[] = new Member[10];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            System.out.println("inviteSale");

            mem[i].callbak();
        }

    }

}

class Customer implements Member {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callbak() {
        System.out.println("i will come back");
    }

}

public class CallBackeMthod2 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("aaaa");
        Customer c2 = new Customer("bbbb");
        s.register(c1);
        s.register(c2);
        s.inviteSale();

    }
}
