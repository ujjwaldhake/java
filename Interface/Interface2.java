package Interface;

//using interface we can achive 100% abstraction and polymerphism using dynamic method dispatch
class Phone {
    void call() {
        System.out.println("Phone Call");
    }

    void sms() {
        System.out.println("Phone sending sms");

    }
}

interface ICamera {
    void click();

    void record();

}

interface IMusicPlayer {
    void play();

    void pause();

    void stop();

}

class Smartphone extends Phone implements ICamera, IMusicPlayer {

    public void play() {
        System.out.println("SmartPhone  playing music");

    }

    public void pause() {
        System.out.println("SmartPhone paused music");

    }

    public void stop() {
        System.out.println("SmartPhone stopped playing music");

    }

    public void click() {
        System.out.println("SmartPhone clicking photo");

    }

    public void record() {
        System.out.println("SmartPhone recording Video");
    }

}

public class Interface2 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        ICamera c = s;
        Phone p = s;
        IMusicPlayer m = s;

    }
}
