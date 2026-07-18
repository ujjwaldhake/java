package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable{
    private static final long serialVersionUID  = 12345L;
    private String sName;
    private int sid;
    private int age ;
    private String addr;
    // public Student(String sName, int sid, int age) {
    //     this.sName = sName;
    //     this.sid = sid;
    //     this.age = age;
    // }
    // public String getsName() {
    //     return sName;
    // }
    // public int getSid() {
    //     return sid;
    // }
    // public int getAge() {
    //     return age;
    // }
    public Student(String sName, int sid, int age, String addr) {
        this.sName = sName;
        this.sid = sid;
        this.age = age;
        this.addr = addr;
    }
    
    public String getsName() {
        return sName;
    }
    public int getSid() {
        return sid;
    }
    public int getAge() {
        return age;
    }
    public String getAddr() {
        return addr;
    }
    
    
    
}

public class Serializationdemo {
    public static void main(String[] args) {
        Student stu = new Student("Ujjwal", 101, 25,"sdjgs");
        // Student stu = new Student("Ujjwal", 101, 25,"sdjgs");
       
        // try(ObjectOutputStream oos  =  new ObjectOutputStream(new FileOutputStream(
        //         "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\SerializationDemo2.txt"))){

        //             oos.writeObject(stu);
                    

        // }catch(Exception e){
        //             e.printStackTrace();
        // }
        try (ObjectInputStream ois  =  new ObjectInputStream(new FileInputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\SerializationDemo2.txt"))){
                  Student s = (Student)ois.readObject();
                  System.out.println(s.getAge());
                  System.out.println(s.getsName());
                  System.out.println(s.getSid());
                  System.out.println(s.getAddr());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
