package OOP.Inheritance;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    void display() {
        System.out.println("lenght " + this.length);
        System.out.println("breadth " + this.breadth);
    }

}/// this is used into insight the class
 // this is a reference to current obj upon the methos or constructor(creating
 /// obj) is called

public class ThisExample {
    public static void main(String[] args) {

    }

}
