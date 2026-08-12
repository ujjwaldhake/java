// package Collection;

// import java.lang.reflect.Field;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class ArrayListDemo1 {
//     public static void main(String[] args)
//             throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
//         ArrayList<Integer> list = new ArrayList<>(4);
//         // ArrayList<Integer> list = new ArrayList<>(1000);
//         System.out.println("Size" + list.size());
//         Field field = ArrayList.class.getDeclaredField("elementData");
//         field.setAccessible(true);
//         Object[] elementData = (Object[]) field.get(list);
//         System.out.println("ArrayList Capacity " + elementData.length);
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(40);
//         list.add(40);
//         Field field1 = ArrayList.class.getDeclaredField("elementData");
//         field.setAccessible(true);
//         Object[] elementData1 = (Object[]) field.get(list);
//         System.out.println("ArrayList Capacity " + elementData1.length);
//         // System.out.println(list.get(2));
//         System.out.println("Size" + list.size());
//         for (int i = 0; i < list.size(); i++) {
//             System.out.println(list.get(i));
//         }
//         System.out.println(".............................................");
//         list.remove(2);
//         System.out.println("Size" + list.size());

//         list.add(2, 555);
//         list.set(0, 111);
//         for (Integer integer : list) {
//             System.out.println(integer);
//         }
//         System.out.println(list);
//         // System.out.println(list.contains(10));
//         // System.out.println(list.contains(100));
//         List<String> list1 = Arrays.asList("MON", "TUE", "WED", "THU");
//         // not modified on the fly
//         // we cannot add or remove 
//         // we can replace 
//         System.out.println(list1.getClass().getName());
//         list1.set(0, "SUN");
//         String[] s = { "Apple", "Banana", "Mango" };
//         List<String> list2 = Arrays.asList(s);
//         System.out.println(list1.getClass().getName());
//     }

// }
package Collection;

// Used to access private fields using Reflection
import java.lang.reflect.Field;

// ArrayList class
import java.util.ArrayList;

// Used for Arrays.asList()
import java.util.Arrays;

// List Interface
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args)
            throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {

        // Create an ArrayList with initial capacity 4
        // Capacity = 4
        // Size = 0
        ArrayList<Integer> list = new ArrayList<>(4);

        // Prints number of elements present in the list
        // Currently no elements are added
        System.out.println("Size : " + list.size());

        // Get the private field named "elementData"
        // elementData is the internal array used by ArrayList
        Field field = ArrayList.class.getDeclaredField("elementData");

        // Allow access to the private field
        field.setAccessible(true);

        // Read the value of elementData from this ArrayList
        // field.get() returns Object
        // Therefore we cast it to Object[]
        Object[] elementData = (Object[]) field.get(list);

        // Print the capacity of ArrayList
        // Capacity is length of internal array
        System.out.println("ArrayList Capacity : " + elementData.length);

        // ---------------- ADD ELEMENTS ----------------

        // Add first element
        list.add(10);

        // Add second element
        list.add(20);

        // Add third element
        list.add(30);

        // Add fourth element
        list.add(40);

        // Capacity becomes full here

        // Add fifth element
        // ArrayList automatically creates a bigger array
        list.add(40);

        // Add sixth element
        list.add(40);

        // Again read internal array after resizing
        Object[] elementData1 = (Object[]) field.get(list);

        // Capacity is now increased
        System.out.println("ArrayList Capacity : " + elementData1.length);

        // Print current size
        System.out.println("Size : " + list.size());

        // Print every element using for loop
        for (int i = 0; i < list.size(); i++) {

            // get(i) returns element at index i
            System.out.println(list.get(i));
        }

        System.out.println("---------------------------------------");

        // Remove element present at index 2
        // Element 30 will be removed
        // Remaining elements shift towards left
        list.remove(2);

        // Print size after removing one element
        System.out.println("Size : " + list.size());

        // Insert 555 at index 2
        // Existing elements shift towards right
        list.add(2, 555);

        // Replace first element
        // Old value 10 becomes 111
        list.set(0, 111);

        // Enhanced for loop
        // Prints every element one by one
        for (Integer integer : list) {

            System.out.println(integer);
        }

        // Print complete ArrayList
        System.out.println(list);

        // Returns true if 10 exists
        // System.out.println(list.contains(10));

        // Returns false because 100 is not present
        // System.out.println(list.contains(100));

        // Arrays.asList() creates a fixed-size List
        List<String> list1 = Arrays.asList(
                "MON",
                "TUE",
                "WED",
                "THU");

        // Important
        // We cannot add new elements
        // list1.add("FRI"); // Exception

        // We cannot remove elements
        // list1.remove(0); // Exception

        // We CAN replace existing elements
        list1.set(0, "SUN");

        // Print implementation class name
        System.out.println(list1.getClass().getName());

        // Create normal String array
        String[] s = {
                "Apple",
                "Banana",
                "Mango"
        };

        // Convert array into List
        List<String> list2 = Arrays.asList(s);

        // Print implementation class
        // IMP not imp
        System.out.println(list2.getClass().getName());
        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(2);
        list6.add(3);
        list6.remove(1);
        list6.remove(Integer.valueOf(1));
        List<String> list7 = new ArrayList<>();
        list7.add("A");
        list7.add("B");
        list7.add("D");
        list7.remove("A");
        list7.toArray();

    }
}
