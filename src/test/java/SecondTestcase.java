import org.testng.annotations.*;

//import org.openqa.selenium.ie.InternetExplorerDriver;
public class SecondTestcase {



//    @Test
//    public void config(){
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//        gh = new GoogleHome(driver);
//    }

//    @BeforeGroups
//    public void BeforeGroups(){
//        System.out.println("my BeforeGroups - SecondTestcase");
//    }
//
//    @BeforeSuite
//    public void BeforeSuite(){
//        System.out.println("my BeforeSuite - SecondTestcase");
//    }
//
//    @BeforeTest
//    public void BeforeTest(){
//        System.out.println("my BeforeTest - SecondTestcase");
//    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("my BeforeClass - SecondTestcase");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("my BeforeMethod - SecondTestcase");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("my AfterClass - SecondTestcase");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("my AfterMethod - SecondTestcase");
    }


    @Test
    public void myMethod1SecondTestcase(){
        System.out.println("my method1 - SecondTestcase");
//        Assert.assertFalse(true);
    }

    @Test(priority=0)
    public void myMethod2SecondTestcase(){
        System.out.println("my method2 - SecondTestcase");
    }

    @Test
    public void myMethod3SecondTestcase(){
        System.out.println("my method3 - SecondTestcase");
    }


    @Test
    public void myMethod4SecondTestcase(){
        System.out.println("my method4 - SecondTestcase");
    }


}
