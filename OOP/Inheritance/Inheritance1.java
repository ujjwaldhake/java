package OOP.Inheritance;
class Circle{
   public double radious;
   public double area(){
    return Math.PI*radious*radious;
   }
   public double perimeter(){
    return 2*Math.PI*radious;
   }
    public double circumference(){
        return perimeter();
    }
}
class Cylender extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }

}

public class Inheritance1 {

    public static void main(String[] args) {
        Cylender c = new Cylender();
        c.radious=7;
        c.height=10;
        System.out.println("Voluem of Cylender  "+c.volume());
        System.out.println("area of Cylender  "+c.area());
        
        
    }
}
