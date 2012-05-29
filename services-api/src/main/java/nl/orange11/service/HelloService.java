package nl.orange11.service;

/**
 * Simple service implementation.
 *
 * @author Jelmer Kuperus
 */
public interface HelloService {

    /**
     * Returns a message that says hello.
     *
     * @param name the name of the person to say hello to
     * @return the created message
     */
    String sayHello(String name);

}
