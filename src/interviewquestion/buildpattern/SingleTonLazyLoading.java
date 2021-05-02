package interviewquestion.buildpattern;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class SingleTonLazyLoading {

    public static SingleTonLazyLoading singleTonLazyLoading;

    private SingleTonLazyLoading(){}

    public static SingleTonLazyLoading getSingleTon(){
        // Lazy Loading SingleTon class
        if ( singleTonLazyLoading == null){
            singleTonLazyLoading =  new SingleTonLazyLoading();
        }
        return singleTonLazyLoading;
    }

}
