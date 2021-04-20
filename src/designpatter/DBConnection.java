package designpatter;

/**
 * Created by Praveenkumar on 4/20/2021.
 */
public class DBConnection {

    public static DBConnection dbConnectioninstance;

    private DBConnection(){}

    public static DBConnection getDbConnectioninstance(){

        if (dbConnectioninstance==null){
            new DBConnection();
        }
        return dbConnectioninstance;
    }

}
