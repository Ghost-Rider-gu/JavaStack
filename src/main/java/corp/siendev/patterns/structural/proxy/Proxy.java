package corp.siendev.patterns.structural.proxy;

/**
 * Simple Proxy for worker
 */
public class Proxy implements IWorker
{
    private WorkerImpl workerInstance;

    private void checkWorkerInstance()
    {
        if(workerInstance == null) {
            workerInstance = new WorkerImpl();
        }
    }

    @Override
    public void wakeUp()
    {
        checkWorkerInstance();
        workerInstance.wakeUp();
    }

    @Override
    public int getLevelHealthy()
    {
        checkWorkerInstance();
        return workerInstance.getLevelHealthy();
    }

    @Override
    public void timeOut()
    {
        checkWorkerInstance();
        workerInstance.timeOut();
    }

    @Override
    public void done()
    {
        checkWorkerInstance();
        workerInstance.done();
    }
}
