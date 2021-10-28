package testngdemos;

import org.testng.annotations.Test;

//https://testng.org/doc/documentation-main.html#parameters
//dependency being used than priority
public class TestngDependencyDemo {
    @Test(dependsOnMethods = {"test2"},priority = 1)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 2,dependsOnGroups = {"group1"})
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(groups = {"group1"})
    public void test3(){
        System.out.println("This is test 3");
    }
}
