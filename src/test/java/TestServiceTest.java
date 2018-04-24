import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestServiceTest {

    ITestService testService;

    @Before
    public void beforeTest(){

        testService = new TestService();
    }

    @Test
    public void testTestService(){

        assertEquals("Hello World!", testService.helloMessage());
    }
}
