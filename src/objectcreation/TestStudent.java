package objectcreation;

/**
 * Created by Praveenkumar on 4/16/2021.
 */
public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println(student1.equals(student2));

    }

}
