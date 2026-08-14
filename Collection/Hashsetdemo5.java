package Collection;

import java.util.HashSet;

class Student1 {
    private int id;
    private String name;
    private int marks;

    public Student1() {
    }

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + marks;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student1 other = (Student1) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (marks != other.marks)
            return false;
        return true;
    }

}

public class Hashsetdemo5 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "UJjwal", 99);
        Student1 s2 = new Student1(2, "tejas", 20);
        Student1 s3 = new Student1(3, "jay", 34);
        Student1 s4 = new Student1(4, "durvesn", 43);
        Student1 s5 = new Student1(1, "UJjwal", 99);
        HashSet<Student1> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students.size());
        System.out.println(students);
    }

}
