import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {


    @Test(dataProvider = "nameSet")
    public void loginTest(String name, String rank){

        System.out.println(name + " " +rank);

    }


    @DataProvider(name="nameSet")
    public Object[][] getData(){

        Object[][] data= {{"John","1"},{"Sandra","1"},{"Mayo","3"}};
        return data;
    }

}
