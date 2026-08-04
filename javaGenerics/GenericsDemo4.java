package javaGenerics;

class A {
}

class B extends A {
}

class c extends A {
}

@SuppressWarnings("unchecked")
class MyArrey<T> {
    T A[] = (T[]) new Object[10];
    int lenght = 0;

    public void append(T v) {
        A[lenght++] = v;
    }

    public void display() {
        for (int i = 0; i < lenght; i++) {
            System.out.println(A[i]);
        }
    }

}

class MyArrey2<T> extends MyArrey<T> {

}

public class GenericsDemo4 {
    public static void main(String[] args) {
        MyArrey2<Integer> ma = new MyArrey2<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

    }

}
// NO parameter
// Multiplae parater
// Subtype we w have class generic and dub class will also becom generics if we
// are providng parameter wihtle extending
// Generic class it will take as object class
// class MyArrey2 extends MyArrey<String> MyArrey2 will act as string only
// class MyArrey2<T> extends MyArrey<T>
// bounded type class MyArrey<T extends Number>
