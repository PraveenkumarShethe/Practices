package interviewquestion.buildpattern;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class SingleTonTest {

    public static void main(String[] args) {

        SingleTonLazyLoading singleTonLazyLoading = SingleTonLazyLoading.getSingleTon();
        SingleTonLazyLoading singleTonLazyLoading1 = SingleTonLazyLoading.getSingleTon();

        SingleTon singleTon = SingleTon.getSingleTon();
        SingleTon singleTon1 = SingleTon.getSingleTon();

        System.out.println(singleTon.equals(singleTon1));
        System.out.println(singleTonLazyLoading.equals(singleTonLazyLoading1));


    }
}
