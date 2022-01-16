import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class Parameterization {

    WebDriver driver;

    @BeforeClass
    @Parameters({"fName","lName"})
    public void config(String fN, String lN){

        System.out.println(fN +" "+lN);
        System.setProperty("webdriver.ie.driver", "C:\\Users\\shash\\TestNG\\TestNGPractice\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();

        driver.get("https://www.google.com/");
    }


    @Test
    @Parameters({"fName","lName"})
    public void assertMethod(String fN, String lN){
        System.out.println(fN +" "+lN);

        driver.quit();
    }


}
