package javaGenerics;

// wildcard
@SuppressWarnings("unchecked")
class MyArray<T> {
    T A[] = (T[]) new Object[10];
    int lenght = 0;

    public void append(T v) {
        A[lenght++] = v;
    }

    public void display() {
        for (int i = 0; i < lenght; i++) {
            System.out.print(A[i] + " ");
        }
    }

}

public class GenericsDemo5 {
    static <E> void show(E[] list) {
        for (E e : list) {
            System.out.println(e);

        }
    }

    static void fun(MyArray<? extends Object> obj) { // wild card ans this is not bounded and <?> we can give any type
                                                     // of argument
        // MyArray<? extends Number> obj upper bound
        // MyArray<? Super Number> obj lower bound
        obj.display();

    }

    public static void main(String[] args) {
        MyArray<String> ma1 = new MyArray<>();
        ma1.append("hii");
        ma1.append("hello");
        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(20);
        fun(ma1);
        fun(ma2);

    }

}
// Generics Methods
// Wild Card in argument
// lower bound
// upper bound
