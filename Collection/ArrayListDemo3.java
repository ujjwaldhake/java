package Collection;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> nameListOne = new ArrayList<>();
        // addig value : add (value)
        nameListOne.add("One");
        nameListOne.add("two");
        nameListOne.add("Three");
        nameListOne.add("four");
        nameListOne.add("five");
        // how to get the value : get(index number)
        System.out.println(nameListOne.get(0));
        System.out.println(nameListOne.get(1));
        System.out.println(nameListOne.get(2));
        System.out.println(nameListOne.get(3));
        System.out.println(nameListOne.get(4));
        // how to know size of array LIst : size() (Array : length)
        System.out.println(nameListOne.size());
        // out of index : 0 -> size()-1
        // Array : ArrayIndexOutOfBoundException

    }

}
