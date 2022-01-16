import org.testng.annotations.*;

//import org.openqa.selenium.ie.InternetExplorerDriver;
public class GroupTestcases {



//    @Test
//    public void config(){
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//        gh = new GoogleHome(driver);
//    }




    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("my BeforeGroups - FirstTestcase");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("my BeforeSuite - FirstTestcase");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("my BeforeTest - FirstTestcase");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("my BeforeClass - FirstTestcase");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("my BeforeMethod - FirstTestcase");
    }



    @AfterGroups
    public void AfterGroups(){
        System.out.println("my AfterGroups - FirstTestcase");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("my AfterSuite - FirstTestcase");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("my AfterTest - FirstTestcase");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("my AfterClass - FirstTestcase");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("my AfterMethod - FirstTestcase");
    }


    @Test(groups = {"smoke"})
    public void myMethod1FirstTestcase(){
        System.out.println("my method1 - FirstTestcase");
    }


    @Test(priority=0, groups = {"smoke"})
    public void myMethod2FirstTestcase(){
        System.out.println("my method2 - FirstTestcase");
//        Assert.assertFalse(true);
    }

    @Test(groups = {"regression"})
    public void myMethod3FirstTestcase(){
        System.out.println("my method3 - FirstTestcase");
//        Assert.assertFalse(true);
    }

    @Test(groups = {"regression"})
    public void myMethod4FirstTestcase(){
        System.out.println("my method4 - FirstTestcase");
//        Assert.assertFalse(true);
    }

    @Test
    public void myMethod5FirstTestcase(){
        System.out.println("my method5 - FirstTestcase");
//        Assert.assertFalse(true);
    }


}
