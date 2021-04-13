package threading.deadlock.example;

/**
 * Created by Praveenkumar on 4/13/2021.
 */
// This class is shared by both threads
class Shared
{
    // first synchronized method
    synchronized void test1(Shared s2)
    {
        System.out.println("test1-begin");
        Util.sleep(1000);

        // taking object lock of s2 enters
        // into test2 method
        s2.test2(s2);
        System.out.println("test1-end");
    }

    // second synchronized method
    synchronized void test2(Shared s2)
    {
        System.out.println("test2-begin");
        Util.sleep(1000);
        // taking object lock of s1 enters
        // into test1 method
        System.out.println("test2-end");
    }
}