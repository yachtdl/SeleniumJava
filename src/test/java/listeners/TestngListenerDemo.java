package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//https://testng.org/doc/documentation-main.html#testng-listeners
@Listeners(listeners.TestngListeners.class)
public class TestngListenerDemo {
    @Test
    public void test1(){
        System.out.println("This is test 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
}
