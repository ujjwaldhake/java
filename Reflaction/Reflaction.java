package Reflaction;

import java.lang.annotation.Retention;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// This is the actual class whose metadata and object we will access using Reflection
class Abc {
    private int age = 20;
    private String name = "ujjwal";

    // A normal method that can be invoked later using Reflection

    void meth() {
        System.out.println("hii");
    }
}

public class Reflaction {

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException,
            SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {

        // Step 1: Ask JVM -> "Please find the class named Reflaction.Abc"
        // JVM loads the class (if not already loaded) and returns its Class object
        // (metadata).
        Class obj = Class.forName("Reflaction.Abc");

        // Step 2: Ask the metadata object -> "What is your full name?"
        System.out.println(obj.getName());

        // Step 3: Print the metadata object's string representation.
        // Usually prints something like: class Reflaction.Abc
        System.out.println(obj.toString());

        // Step 4: Again ask JVM for Abc's metadata.
        // obj1 is NOT an Abc object.
        // It is a Class object containing information about Abc.
        Class obj1 = Class.forName("Reflaction.Abc");

        // Step 5: Using the metadata (Class object),
        // ask Reflection to create a real Abc object at runtime.
        // ===============================================================
        // Reflection internally calls: new Abc()
        // Create a new object of the class represented by obj1.
        // newInstance() calls the no-argument constructor and returns an Object.
        Object o = obj1.newInstance();

        // Get the Field object representing the private field "age".
        // Reflection searches for a field with the given name in the class.
        Field field = obj1.getDeclaredField("age");

        // Disable Java access checks so that private fields can be accessed.
        field.setAccessible(true);

        // Read the value of the "age" field from object 'o'.
        // field.get(o) returns the value stored in the field for that object.
        System.out.println("Private field of abc: " + field.get(o));

        Field fieldsArray[] = obj1.getDeclaredFields();
        for (Field field2 : fieldsArray) {
            field2.setAccessible(true);
            System.out.println(field2.getName() + field2.get(o));
        }

        Method m = obj1.getDeclaredMethod("meth");
        m.setAccessible(true);
        m.invoke(o);
        int modi = obj1.getModifiers();
        // internally PUBlic -->1
        // internally private -->2
        // internally proctected -->4
        // internally static -->8
        // thats why it is int rturn type
        System.out.println(Modifier.toString(modi));

    }
}

// ========================================
// internally
// Class object (obj1)
// │
// ├── newInstance()
// │ ↓
// │ Creates object 'o'
// │
// └── getDeclaredField("age")
// ↓
// Returns Field object
// ↓
// setAccessible(true)
// ↓
// Bypass private access check
// ↓
// field.get(o)
// ↓
// Read age value from object 'o'
// ================================================================
// Story Summary:
// Class.forName() -> "Give me Abc's blueprint (metadata)"
// Class object -> "Contains details about Abc"
// newInstance() -> "Use the blueprint to build a real Abc object"
// o -> "Actual Abc object created at runtime"

// Class.forName() -> Find the class and give me its blueprint.
// Class object -> Blueprint/metadata of the class.
// newInstance() -> Build a real object using that blueprint.
// Reflection -> Creating/inspecting objects using metadata at runtime.

// Class object
// ├── Constructor metadata
// ├── Method metadata
// ├── Field metadata
// ├── Class name
// ├── Parent class
// └── Interfaces
// =======================================================================================
// Annotation
// it is nothing but a extra info used for complier or jvm
// commetn (human readble for developer )
// APT annotation processing tool use to process annotation
// represent using @
// annotation policy
// source code ---> .class/byte code -----> runtime
// dource policy ,class policy , runtime policy