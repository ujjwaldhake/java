package Object_cloning;

class Address {
    String city;

    Address(String city) {
        this.city = city;
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
        return super.clone(); // shallow clone
    }
}

public class ShallowCloning {
    public static void main(String[] args) throws Exception {

        Address a1 = new Address("Mumbai");

        Student s1 = new Student(101, a1);

        Student s2 = (Student) s1.clone();

        s2.address.city = "Pune";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }

}
