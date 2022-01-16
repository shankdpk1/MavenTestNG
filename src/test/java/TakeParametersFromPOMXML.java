import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TakeParametersFromPOMXML {

    @Parameters({"browser","clientname"})   //take same name as mentioned in POM.XML TagName
    @Test
    void takingParameterFromPOM(String myBrowser, String myClientName){
        System.out.println("parameter browser is "+ myBrowser);
        System.out.println("parameter clntnm is "+ myClientName);

        if(myBrowser.equalsIgnoreCase("Chrome")){
            System.out.println("i am in chrome");
        }
        else if(myBrowser.equalsIgnoreCase("ie")){
            System.out.println("i am in ie");
        }

    }
}
