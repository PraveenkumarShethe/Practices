package interviewquestion.buildpattern;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class SingleTon {

    public static SingleTon singleTonInstance;

    private SingleTon(){}

    public static SingleTon getSingleTon(){
        // Eagar Loading SingleTon class
        singleTonInstance =  new SingleTon();
        return singleTonInstance;
    }

}
