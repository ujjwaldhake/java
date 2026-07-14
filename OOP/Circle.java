package OOP;

public class Circle {
    public double radious;

    public double Area(){
      return Math.PI*radious*radious;
    }

    public double parimeter (){
     return 2*Math.PI*radious;
    }
    public double circumference (){
     return parimeter();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle();
        c.radious=7;
        c1.radious=8;
         System.out.println("Raidous c " + c.radious);
         System.out.println("Area c " + c.Area());
         System.out.println("parimeter c " +c.parimeter());
         System.out.println("circumference c "+ c.circumference());
         System.out.println("c1---------------");
         System.out.println("Raidous c1 " + c1.radious);
         System.out.println("Area c1 " + c.Area());
         System.out.println("parimeter c1 " +c.parimeter());
         System.out.println("circumference c1 "+ c.circumference());
    }
}
