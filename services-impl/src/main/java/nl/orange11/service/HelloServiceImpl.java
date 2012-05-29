package nl.orange11.service;

import java.sql.Timestamp;

/**
 * Default implementation of the {@link HelloService} interface.
 *
 * @author Jelmer Kuperus
 */
public class HelloServiceImpl implements HelloService {

    /**
     * {@inheritDoc}
     */
    public String sayHello(String name) {

        Timestamp timestamp = new Timestamp(0L);

        //timestamp.getNanos();


        return "hello " + name;
    }
}
