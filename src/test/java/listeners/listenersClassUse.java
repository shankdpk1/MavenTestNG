package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersClass.class)
public class listenersClassUse {


    @Test
    void method1(){
        System.out.println("i am in method1");
    }

    @Test
    void method2(){
        System.out.println("i am in method2");
    }

    @Test
    void method3(){
        System.out.println("i am in method3");
        Assert.fail();
    }

    @Test
    void method4(){
        System.out.println("i am in method4");
        throw new SkipException("skipped method 4");
    }

    @Test
    void method5(){
        System.out.println("i am in method5");
    }

}
