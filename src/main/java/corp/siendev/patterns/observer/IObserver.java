package corp.siendev.patterns.observer;

/**
 * Simple interface for future Observers
 */
public interface IObserver
{
    /**
     * Update current observer
     *
     * @param message any message
     */
    void update(String message);
}
