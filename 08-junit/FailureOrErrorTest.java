package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FailureOrErrorTest {

    @Test
    void test1(){
        assertTrue( 2 == 3);
    }

    @Test
    void test2(){
        Integer.parseInt("dwa");
    }

    @Test
    void test3(){
        try {
            assertTrue(2 == 3);
        } catch (Throwable t ){
            t.printStackTrace();
        }
    }
}
