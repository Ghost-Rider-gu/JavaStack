package corp.siendev.patterns.structural.proxy;

import java.io.Serializable;
import java.util.Random;

/**
 * Simple implementation for worker interface
 */
public class WorkerImpl implements IWorker, Serializable
{
    private static final long serialVersionUID = 42345092837455123L;

    private String workerName;
    private int workerId;
    private int workerStatus = 0;

    public WorkerImpl()
    {
        Random rand = new Random();
        this.workerId = rand.nextInt();
    }

    public String getWorkerName()
    {
        return workerName;
    }

    public void setWorkerName(String workerName)
    {
        this.workerName = workerName;
    }

    public int getWorkerId()
    {
        return workerId;
    }

    public void setWorkerId(int workerId)
    {
        this.workerId = workerId;
    }

    public int getWorkerStatus()
    {
        return workerStatus;
    }

    @Override
    public void wakeUp()
    {
        this.workerStatus = 1;
        System.out.println("Wake up! Sleeping beauty");
    }

    @Override
    public int getLevelHealthy()
    {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    @Override
    public void timeOut()
    {
        this.workerStatus = 2;
        System.out.println("Let's go to the kitchen");
    }

    @Override
    public void done()
    {
        this.workerStatus = 3;
        System.out.println("Go home! Continue tomorrow");
    }

    @Override
    public String toString()
    {
        return "Worker name is: " + this.workerName + "\n Worker status is: " + this.workerStatus + "\n Worker id is: " + this.workerId;
    }
}
