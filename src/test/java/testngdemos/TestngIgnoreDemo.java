package testngdemos;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestngIgnoreDemo {
    @Test
    @Ignore
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
}
