package testngdemos;

import org.testng.annotations.Test;

@Test(groups = {"tests"})
public class TestngGroupDemo {
    @Test(groups = {"smoke", "sanity"})
    public void test1() {
        System.out.println("This is test 1");
    }

    @Test(groups = {"regression", "sanity"})
    public void test2() {
        System.out.println("This is test 2");
    }

    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("This is test 3");
    }

    @Test(groups = {"windows.regression"})
    public void test4() {
        System.out.println("This is test 4");
    }

    @Test(groups = {"linux.regression"})
    public void test5() {
        System.out.println("This is test 5");
    }
}
