package Java8;

@FunctionalInterface
interface GetEmployeeINstance {
    // Employee getEmployee(int id, String name);
    Employee getEmployee(int id);
}

class Employee {
    private int id;
    private String name;

    public Employee() {
        System.out.println("This is Employee COnctroctor with no data ");
    }

    // public Employee(int id, String name) {
    // System.out.println("This is Employee COnctroctor with with data ");

    // this.id = id;
    // this.name = name;

    // }

    public Employee(int id) {
        System.out.println("This is only id value initialization constroctor ");

        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}

public class ConstructorReferenceDemoMain {
    public static void main(String[] args) {
        // Employee e = new Employee();
        GetEmployeeINstance employee = Employee::new;
        // Employee emp = employee.getEmployee(100, "Ujjwal");
        // System.out.println(emp);

        Employee emp2 = employee.getEmployee(100);
        System.out.println(emp2);

    }

}
