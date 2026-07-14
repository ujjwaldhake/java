package OOP.Inheritance;

class Parent{
    public Parent(){
    System.out.println("Parent Constructor");
    }
    public Parent(int x){
    System.out.println("param Parent Constructor "+ x);
    }
}
class Child extends Parent{
    public Child(){
    System.out.println("Child Constructor");
    }
    public Child(int y){
    System.out.println("param Child Constructor");
    }
     public Child(int x,int y){
        super(x);
    System.out.println("two param Child Constructor");
    }

}
// class GrandChild extends Child{
//     public GrandChild(){
//     System.out.println("GrandChild Constructor");
//     }

// }


public class ConstructorInInheritance {
    public static void main(String[] args) {
        // GrandChild c = new GrandChild();
        Child chi = new Child(10,20);
    }
}
