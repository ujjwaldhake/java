package Object_cloning;

class Address implements Cloneable {

    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {

    int id;
    Address address;

    Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {

        Student cloned = (Student) super.clone();
        cloned.address = (Address) address.clone();

        return cloned;
    }
}

public class DeepCloning {
    public static void main(String[] args) throws Exception {

        Address a1 = new Address("Mumbai");

        Student s1 = new Student(101, a1);

        Student s2 = (Student) s1.clone();

        s2.address.city = "Pune";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}

// can we make clone without implimenting clonable interface because to clone
// method belongs to object class which is mother of all class then why we need
// clonable interface

// Excellent question 😄🔥
// This is one of the most confusing concepts in Java cloning.

// You are absolutely right that:

// clone()

// method already exists in Object class.

// Then why do we still need:

// implements Cloneable

// ? 🤔

// Short Answer 🚀

// Because Java designers wanted:

// cloning should happen ONLY for classes that explicitly allow it.

// So Cloneable acts like a permission marker/tag.

// What happens internally?

// Inside Object.clone() there is roughly logic like:

// if(this instanceof Cloneable)
// perform cloning;
// else
// throw CloneNotSupportedException;

// So even though every class inherits clone(),
// Java does NOT allow cloning unless class says:

// implements Cloneable
// Example WITHOUT Cloneable ❌
// class Test {

// int age = 21;
// }

// public class Main {

// public static void main(String[] args)
// throws CloneNotSupportedException {

// Test t1 = new Test();

// Test t2 = (Test) t1.clone();
// }
// }

// This won't even compile properly because:

// clone() is protected in Object
// and class is not Cloneable

// Even if accessible, runtime exception comes:

// CloneNotSupportedException
// Example WITH Cloneable ✅
// class Test implements Cloneable {

// int age = 21;

// @Override
// protected Object clone()
// throws CloneNotSupportedException {

// return super.clone();
// }
// }

// Now cloning works 😊

// Why Java designers used marker interface? 🤔

// Because cloning can be dangerous sometimes:

// shared references
// shallow copy problems
// mutable object issues

// So Java wanted explicit permission from programmer.

// Important Insight ✨

// Cloneable does NOT provide:

// method
// implementation
// logic

// It only says:

// “Yes JVM, cloning is allowed for this class.”

// Actual cloning work is still done by:

// Object.clone()
// Easy Analogy 😄

// Think of clone() as a photocopy machine.

// Every object has access to machine,
// BUT Cloneable is the permission card 🪪

// Without permission card:
// ❌ machine refuses copying.