package testngdemos;

import listeners.MyRetry;
import org.testng.Assert;
import org.testng.annotations.Test;

//https://testng.org/doc/documentation-main.html#rerunning
public class TestngRetryDemo {
    @Test()
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(retryAnalyzer = MyRetry.class)
    public void test2(){
        System.out.println("This is test 2");
        Assert.assertTrue(false);
    }

    @Test()
    public void test3(){
        System.out.println("This is test 3");
    }
}
