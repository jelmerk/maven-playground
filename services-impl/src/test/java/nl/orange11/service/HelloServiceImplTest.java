package nl.orange11.service;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Jelmer Kuperus
 */
public class HelloServiceImplTest extends TestCase {

    private HelloServiceImpl service;

    @Override
    public void setUp() throws Exception {
        service = new HelloServiceImpl();
    }

    @Test
    public void testSayHello() throws Exception {
        assertEquals("hello jelmer1004", service.sayHello("jelmer"));
    }

}
