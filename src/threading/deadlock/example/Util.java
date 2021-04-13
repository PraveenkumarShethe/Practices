package threading.deadlock.example;

/**
 * Created by Praveenkumar on 4/13/2021.
 */
class Util
{
    static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
