package javaGenerics;

/**
 * Container
 */
interface Container<T> {
    void add(T items);

    T get();

}

public class GenericsDemo7<T> implements Container<T> {

    @Override
    public void add(T items) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

}
