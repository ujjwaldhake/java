package OOP;

public class Rectangle {

    private double length;
    private double breadth;

     public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

     public double area(){
        return getLength()*getBreadth();
     }

     public double perimeter(){
        return 2*(getLength()*getBreadth());
     }

 public static void main(String[] args) {

    Rectangle r = new Rectangle();
    r.setBreadth(5.5);
    r.setLength(10.5);
    
 }
    
}
