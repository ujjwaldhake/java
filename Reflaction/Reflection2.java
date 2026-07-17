package Reflaction;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Abcd{
    private int age = 20;
    private int age1 = 21;
    private int age2 = 22;
    void meth(){
     System.out.println("meth");
    }
}

public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
    //  Class<?> obj =  Class.forName("Reflaction.Abc");
    //  System.out.println(obj.getName());
    //  System.out.println(obj.toString());

    //Object creation at runtime

   Class<?> obj =  Class.forName("Reflaction.Abcd");
   Object o1 = obj.getDeclaredConstructor().newInstance();//type 1 this is new mwethod to create object at runtime
    Object o =obj.newInstance();//this is depricated 
     Field field =   obj.getDeclaredField("age");
     field.setAccessible(true);
     System.out.println("private field of abc  "+field.get(o));
     Field[] arrayOfField = obj.getDeclaredFields();
     for (Field f : arrayOfField) {
        f.setAccessible(true);
        System.out.println(f.getName() + " "+f.get(o) );


        
     }
     System.out.println("Method---------------------------");

  Method m = obj.getDeclaredMethod("meth");
  m.setAccessible(true);
  m.invoke(o);
System.out.println("Modifier---------------------------");
  int modi = obj.getModifiers();
  System.out.println(modi);
  System.out.println(Modifier.toString(modi));

    }
    
}
