import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyAlwaysRunTest {


    @Test
    void startCar(){
        System.out.println("start car");
//        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("drive car");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stop car");

    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("park car");
    }



}
