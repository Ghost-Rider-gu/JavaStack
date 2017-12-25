package corp.siendev.patterns.behavioral.observer;

/**
 * Simple interface for publishers
 */
public interface ISubject
{
    /**
     * Register (add) new observer in the system
     *
     * @param obs Observer
     */
    void register(IObserver obs);

    /**
     * Unregister (remove) observer in the system
     *
     * @param obs Observer
     */
    void unregister(IObserver obs);

    /**
     * Remove all observers
     */
    void reset();

    /**
     * Notify all observers in the system
     */
    void notifyObservers(String message);
}
