import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TakeParametersFromPOMXML {

    @Parameters({"browser","clientname","country","status"})   //take same name as mentioned in POM.XML TagName
    @Test
    void takingParameterFromPOM(String myBrowser, String myClientName, String myCountry, String myStatus){
        System.out.println("parameter country is "+ myCountry);
        System.out.println("parameter status is "+ myStatus);
        System.out.println("parameter browser is "+ myBrowser);
        System.out.println("parameter clntnm is "+ myClientName);

        if(myBrowser.equalsIgnoreCase("Chrome")){
            System.out.println("i am in chrome");
        }
        else if(myBrowser.equalsIgnoreCase("ie")){
            System.out.println("i am in ie");
        }

    }

//    @Parameters({"multilinestring"})   //take same name as mentioned in POM.XML TagName
//    @Test
//    void takingParameterFromPOM2(String mymultilinestring){
//        System.out.println("parameter mymultilinestring is "+ mymultilinestring);
//
//    }


    @Parameters({"browser"})   //take same name as mentioned in POM.XML TagName
    @Test
    void takingParameterFromPOM1(String myBrowser){
        System.out.println("parameter browser is "+ myBrowser);

        if(myBrowser.equalsIgnoreCase("Chrome")){
            System.out.println("i am in chrome");
        }
        else if(myBrowser.equalsIgnoreCase("ie")){
            System.out.println("i am in ie");
        }

    }
}
