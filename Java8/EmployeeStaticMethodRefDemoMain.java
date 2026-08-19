package Java8;

@FunctionalInterface
interface EmployeeValidation {
    // taking in EMp Details and checking id name : true or false
    boolean isValidEmployee(EmployeeStaticMethodRefDemo employee);

}

class EmployeeStaticMethodRefDemo {
    private int id;
    private String name;
    private String gender;
    private double salary;

    public EmployeeStaticMethodRefDemo(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Static method
    static boolean validateEmployeeDetails(EmployeeStaticMethodRefDemo employee) {
        if (employee.getId() != 0 && employee.getName() != null)
            return true;
        return false;

    }
}

public class EmployeeStaticMethodRefDemoMain {
    public static void main(String[] args) {
        EmployeeStaticMethodRefDemo emp = new EmployeeStaticMethodRefDemo(101, "Ujjwal", "M", 100000);
        EmployeeStaticMethodRefDemo emp2 = new EmployeeStaticMethodRefDemo(102, "Ujjwal1", "M", 100400);
        // static MEthod : Class Name
        EmployeeValidation validEmployee = EmployeeStaticMethodRefDemo::validateEmployeeDetails;
        System.out.println(validEmployee.isValidEmployee(emp));
        System.out.println(validEmployee.isValidEmployee(emp2));

    }
}