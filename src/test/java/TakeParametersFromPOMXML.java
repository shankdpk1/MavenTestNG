import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TakeParametersFromPOMXML {

    @Parameters("browser")   //take same name as mentioned in POM.XML TagName
    @Test
    void takingParameterFromPOM(String myBrowser){
        System.out.println("parameter  is "+ myBrowser);

        if(myBrowser.equalsIgnoreCase("Chrome")){
            System.out.println("i am in chrome");
        }
        else if(myBrowser.equalsIgnoreCase("ie")){
            System.out.println("i am in ie");
        }

    }
}
