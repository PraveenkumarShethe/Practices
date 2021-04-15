package objectcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Praveenkumar on 4/15/2021.
 */
public class objectCrationinJava {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {

//        Crating object using new keyword
        Student student = new Student();
//        Java Class.newInstance() method
        Student student1 = Student.class.newInstance();
//        Java newInstance() method of Constructor class
        Constructor<Student> student2 = Student.class.getConstructor();
        Student student3 = student2.newInstance();

        Student student4 = new Student();
        student4.clone();

    }

}
