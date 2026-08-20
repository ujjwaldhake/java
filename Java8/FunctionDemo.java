package Java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Req Find half value from given value
        // R apply (T t) r is return type and t is input parameter
        Function<Integer, Double> halfvalue = i -> i / 2.0;
        System.out.println(halfvalue.apply(20));
        // res Given String should be converted toupper case
        // Function<String, String> touppercase = i -> i.toUpperCase();// lembda
        Function<String, String> touppercase = String::toUpperCase;// method references
        System.out.println(touppercase.apply("ujjwal"));
        // default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
        // Req String value
        // is it null or nit : null check ; function
        // if not null , to uppercase : null , enter valid value
        // i/p ujjwal : func1 and then func2
        // null chack
        Function<String, String> func2nullcheck = str -> str == null ? "ENter Valid Value" : str;
        System.out.println(func2nullcheck.andThen(touppercase).apply("aaaaaaaaaaa"));
        // default <V> Function<V,R> compose(Function<? super V,? extends T> before)
        // Returns a composed function that first applies the before function to its
        // input, and then applies this function to the result.
        String value = func2nullcheck.compose(touppercase).apply("aaaa");
        // compose(): First executes the "before" function,
        // then executes the current function.
        // Example: f1.compose(f2) → f2 first, then f1
        Function<Integer, Integer> add10 = i -> i + 10;
        Function<Integer, Integer> multiply2 = i -> i * 2;
        // Function<Integer, Integer> result = add10.compose(multiply2);
        // System.out.println(result.apply(5));
        System.out.println(add10.compose(multiply2).apply(5));
        // 5
        // ↓
        // multiply2 → 5 * 2 = 10
        // ↓
        // add10 → 10 + 10 = 20

        // identity(): Returns a function that returns the input as it is.
        // Input = Output
        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("Ujjwal"));
        // "Ujjwal"
        // ↓
        // identity()
        // ↓
        // "Ujjwal"

    }

}
