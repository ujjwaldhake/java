package javaGenerics;
// before generics 

// class Box {
//     private Object value;

//     public Object getValue() {
//         return value;
//     }

//     public void setValue(Object value) {
//         this.value = value;
//     }

// }
// after generics 
// problems no type safter
// always need casting
// no coimpiler error or warling and getting class cast exception 
class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);
        // int i = (Integer) box.getValue();
        String i = (String) box.getValue();
        System.out.println(i);
    }

}
