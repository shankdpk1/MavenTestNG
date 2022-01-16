package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParallelTest1 {

//parralel execution is avl at classes, tests and methods level. CHeck testNG.xml - suite tag for details

    WebDriver driver;


    @Test
    void method1(){
        System.out.println("I am in method1 - ParallelTest1");
    }

    @Test
    void method2(){
        System.out.println("I am in method2 - ParallelTest1");
    }

}
