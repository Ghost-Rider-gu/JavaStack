package corp.siendev.patterns.proxy;

/**
 * Simple interface (list of work for the day)
 */
public interface IWorker
{
    /**
     * Wake up the worker
     */
    void wakeUp();

    /**
     * Getting percent of healthy for worker
     *
     * @return percent of healthy
     */
    int getLevelHealthy();

    /**
     * Break for dinner
     */
    void timeOut();

    /**
     * End of work day
     */
    void done();
}
