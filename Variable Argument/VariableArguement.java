public class VariableArguement {

  void show(int... a) {
    for (int i : a) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    VariableArguement v = new VariableArguement();
    v.show(10, 11, 12, 13, 14, 15);

  }

}
