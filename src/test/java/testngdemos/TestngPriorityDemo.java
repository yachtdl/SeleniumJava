package testngdemos;

import org.testng.annotations.Test;

public class TestngPriorityDemo {
    @Test
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("This is test 3");
    }
}
