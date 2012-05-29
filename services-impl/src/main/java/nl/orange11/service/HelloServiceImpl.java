package nl.orange11.service;

import java.sql.ResultSet;

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
        return "hello " + name  + ResultSet.TYPE_SCROLL_INSENSITIVE;
    }
}
