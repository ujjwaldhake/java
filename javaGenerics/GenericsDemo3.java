package javaGenerics;

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

public class GenericsDemo3 {
    public static void main(String[] args) {
        MyArrey<Integer> ma = new MyArrey<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

    }

}
