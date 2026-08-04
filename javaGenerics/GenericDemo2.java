package javaGenerics;

class Data<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        // Data<Integer> d = new Data<>();
        // d.setObj(110);
        // System.out.println(d.getObj());
        Data<String> d = new Data<>();
        d.setObj("ujjwal");
        System.out.println(d.getObj());

    }

}
