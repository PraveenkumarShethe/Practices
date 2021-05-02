package interviewquestion.buildpattern;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class SingleTon {

    private SingleTon(){}

    public SingleTon getSingleTon(){
        return new SingleTon();
    }

}
