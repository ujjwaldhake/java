package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Employee class
class Employee {

    int id;
    String name;
    double salary;
    int age;
    String gender;
    String deptName;
    String managerName;
    String city;

    Employee(int id, String name, double salary, int age,
             String gender, String deptName,
             String managerName, String city) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.deptName = deptName;
        this.managerName = managerName;
        this.city = city;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", managerName='" + managerName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


public class EmployeePractice {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // 20 Employee objects
        employees.add(new Employee(1, "Rahul", 75000, 28, "Male", "IT", "Amit", "Mumbai"));
        employees.add(new Employee(2, "Priya", 82000, 27, "Female", "HR", "Neha", "Pune"));
        employees.add(new Employee(3, "Amit", 95000, 35, "Male", "IT", "Vikas", "Mumbai"));
        employees.add(new Employee(4, "Neha", 68000, 30, "Female", "Finance", "Ravi", "Delhi"));
        employees.add(new Employee(5, "Rohit", 88000, 32, "Male", "Sales", "Suresh", "Pune"));
        employees.add(new Employee(6, "Sneha", 72000, 26, "Female", "IT", "Amit", "Mumbai"));
        employees.add(new Employee(7, "Vikas", 105000, 38, "Male", "Management", "Raj", "Delhi"));
        employees.add(new Employee(8, "Pooja", 76000, 29, "Female", "Sales", "Suresh", "Mumbai"));
        employees.add(new Employee(9, "Suresh", 91000, 34, "Male", "Sales", "Raj", "Pune"));
        employees.add(new Employee(10, "Kavita", 69000, 25, "Female", "HR", "Neha", "Delhi"));
        employees.add(new Employee(11, "Raj", 120000, 42, "Male", "Management", "CEO", "Mumbai"));
        employees.add(new Employee(12, "Anjali", 79000, 31, "Female", "Finance", "Ravi", "Pune"));
        employees.add(new Employee(13, "Karan", 83000, 29, "Male", "IT", "Amit", "Delhi"));
        employees.add(new Employee(14, "Meera", 71000, 27, "Female", "IT", "Amit", "Mumbai"));
        employees.add(new Employee(15, "Vivek", 87000, 33, "Male", "Finance", "Ravi", "Pune"));
        employees.add(new Employee(16, "Riya", 93000, 30, "Female", "Sales", "Suresh", "Delhi"));
        employees.add(new Employee(17, "Akash", 66000, 24, "Male", "HR", "Neha", "Mumbai"));
        employees.add(new Employee(18, "Simran", 97000, 36, "Female", "Management", "Raj", "Pune"));
        employees.add(new Employee(19, "Manish", 73000, 28, "Male", "Finance", "Ravi", "Delhi"));
        employees.add(new Employee(20, "Nisha", 85000, 32, "Female", "IT", "Amit", "Pune"));

        // 1. Employee having highest salary
        System.out.println("\n1. Employee with highest salary:");

        Employee highest = employees.get(0);

        for (Employee emp : employees) {
            if (emp.salary > highest.salary) {
                highest = emp;
            }
        }

        System.out.println(highest);


        // 2. Employee having lowest salary
        System.out.println("\n2. Employee with lowest salary:");

        Employee lowest = employees.get(0);

        for (Employee emp : employees) {
            if (emp.salary < lowest.salary) {
                lowest = emp;
            }
        }

        System.out.println(lowest);


        // 3. Count female and male employees
        System.out.println("\n3. Count of male and female employees:");

        int maleCount = 0;
        int femaleCount = 0;

        for (Employee emp : employees) {

            if (emp.gender.equalsIgnoreCase("Male")) {
                maleCount++;
            }

            if (emp.gender.equalsIgnoreCase("Female")) {
                femaleCount++;
            }
        }

        System.out.println("Male   : " + maleCount);
        System.out.println("Female : " + femaleCount);


        // 4. Employees belonging to a specific department
        System.out.println("\n4. Employees from IT department:");

        String requiredDepartment = "IT";

        for (Employee emp : employees) {

            if (emp.deptName.equalsIgnoreCase(requiredDepartment)) {
                System.out.println(emp);
            }
        }


        // 5. Average salary of male and female employees
        System.out.println("\n5. Average salary of male and female employees:");

        double maleSalary = 0;
        double femaleSalary = 0;

        maleCount = 0;
        femaleCount = 0;

        for (Employee emp : employees) {

            if (emp.gender.equalsIgnoreCase("Male")) {
                maleSalary += emp.salary;
                maleCount++;
            }

            if (emp.gender.equalsIgnoreCase("Female")) {
                femaleSalary += emp.salary;
                femaleCount++;
            }
        }

        double maleAverage = maleSalary / maleCount;
        double femaleAverage = femaleSalary / femaleCount;

        System.out.println("Male Average   : " + maleAverage);
        System.out.println("Female Average : " + femaleAverage);


        // 6. Average salary of all employees
        System.out.println("\n6. Average salary of all employees:");

        double totalSalary = 0;

        for (Employee emp : employees) {
            totalSalary += emp.salary;
        }

        double averageSalary = totalSalary / employees.size();

        System.out.println("Average Salary : " + averageSalary);


        // 7. Average salary for each department
        System.out.println("\n7. Average salary for each department:");

        Map<String, Double> departmentSalary = new HashMap<>();
        Map<String, Integer> departmentCount = new HashMap<>();

        for (Employee emp : employees) {

            String department = emp.deptName;

            departmentSalary.put(
                    department,
                    departmentSalary.getOrDefault(department, 0.0) + emp.salary
            );

            departmentCount.put(
                    department,
                    departmentCount.getOrDefault(department, 0) + 1
            );
        }

        for (String department : departmentSalary.keySet()) {

            double average =
                    departmentSalary.get(department)
                    / departmentCount.get(department);

            System.out.println(department + " : " + average);
        }


        // 8. Employees belonging to a specific city
        System.out.println("\n8. Employees from Mumbai:");

        String requiredCity = "Mumbai";

        for (Employee emp : employees) {

            if (emp.city.equalsIgnoreCase(requiredCity)) {
                System.out.println(emp);
            }
        }


        // 9. Count of employees city-wise
        System.out.println("\n9. Count of employees city-wise:");

        Map<String, Integer> cityCount = new HashMap<>();

        for (Employee emp : employees) {

            cityCount.put(
                    emp.city,
                    cityCount.getOrDefault(emp.city, 0) + 1
            );
        }

        for (String city : cityCount.keySet()) {
            System.out.println(city + " : " + cityCount.get(city));
        }


        // 10. Female employees information city-wise
        System.out.println("\n10. Female employees city-wise:");

        Map<String, ArrayList<Employee>> femaleEmployees = new HashMap<>();

        for (Employee emp : employees) {

            if (emp.gender.equalsIgnoreCase("Female")) {

                if (!femaleEmployees.containsKey(emp.city)) {
                    femaleEmployees.put(emp.city, new ArrayList<>());
                }

                femaleEmployees.get(emp.city).add(emp);
            }
        }

        for (String city : femaleEmployees.keySet()) {

            System.out.println("\nCity : " + city);

            for (Employee emp : femaleEmployees.get(city)) {
                System.out.println(emp);
            }
        }
    }
}


