package OOP;
class CylinderTest{
    private int radius;
    private int height;

    CylinderTest(){
        radius=height=0;

    }

    CylinderTest(int radius , int height){
        this.radius=radius;
        this.height=height;

    }

   


    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        if (radius<0){
            this.radius = radius;
        }else{
            this.radius=0;
        }
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height<0){
            this.height = height;
        }else{
            this.height=0;
        }
    }
    public void setDimensions(int r , int h){
        this.height=h;
        this.radius=r;
    }

    public double lidArea(){
        return (Math.PI*radius*radius);
    }

    public double perimeter(){
         return 2*Math.PI*radius;
    }
 public double drumArea(){
    return 2*lidArea()+perimeter()*height;
 }
 public double volume(){
    return lidArea()*height;
 }
    
}


class cylinder{

    public static void main(String[] args) {
        CylinderTest c=new CylinderTest();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);

                System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
    }

}

