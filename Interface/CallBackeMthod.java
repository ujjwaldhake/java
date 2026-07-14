package Interface;

interface Member {
  void callback();
}

class Customer implements Member {
  String name;

  Customer(String n) {
    name = n;
  }

  public void callback() {
    System.out.println("i will call back");
  }

}

class Store {

  Member mem[] = new Member[10];
  int count = 0;

  void register(Member m) {
    mem[count++] = m;
  }

  void inviteSale() {
    for (int i = 0; i < count; i++) {
      System.out.println("sale invite to customer ");

      mem[i].callback();
    }
  }
}

public class CallBackeMthod {
  public static void main(String[] args) {
    Store s = new Store();
    Customer c1 = new Customer("john");
    Customer c2 = new Customer("smith");
    s.register(c1);
    s.register(c2);
    s.inviteSale();

  }

}
