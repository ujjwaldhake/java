package OOP.Inheritance;

class Tv {
    public void swithcON() {
        System.out.println("TV is Swithced on");
    }

    public void chageChannel() {
        System.out.println("TV channel is chages");
    }
}

class SmartTv extends Tv {
    public void swithcON() {
        System.out.println("SmartTV is Swithced on");
    }

    public void chageChannel() {
        System.out.println("SmartTV channel is chages");
    }

    public void brows() {
        System.out.println("SmartTV is browsing");
    }
     public void abc() {
        System.out.println("ABC method from SmartTV");
    }

}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Tv t = new SmartTv();
        t.swithcON();
        t.chageChannel();
        // SmartTv st = (SmartTv) t;
        // st.abc();  
        
    
    }

}
