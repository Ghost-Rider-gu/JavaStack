package corp.siendev.patterns.behavioral.observer;

/**
 * Simple implementation of IObserver
 */
public class FirstObserver implements IObserver
{
    /**
     * Update data from external source
     *
     * @param message any message
     */
    @Override
    public void update(String message)
    {
        String fullMessage = "Got update from external service source: " + message;

        System.out.println(fullMessage);
    }

    /**
     * Another method
     */
    public void doSomething()
    {
        System.out.println("First Observer is working ...");
    }
}
