import org.testng.annotations.Test;

public class DataProviderUser {


    @Test(dataProvider = "nameSet", dataProviderClass = DataProviderClass.class)
    public void loginTestinDataProviderUser(String name, String rank){

        System.out.println(name + " " +rank);

    }



}
