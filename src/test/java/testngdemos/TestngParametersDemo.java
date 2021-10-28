package testngdemos;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametersDemo {
    @Test()
    @Parameters({"name"})
    public void test1(@Optional String name){
        System.out.println("This is test "+name);
    }
}
