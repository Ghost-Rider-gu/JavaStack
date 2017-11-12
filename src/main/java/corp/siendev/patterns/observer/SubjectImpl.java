package corp.siendev.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubject
{
    /**
     * List of observers
     */
    private List<IObserver> observers = new ArrayList<>();

    /**
     * Flag for update
     */
    private int flag = 0;

    /**
     * Get flag
     *
     * @return Flag
     */
    public int getFlag()
    {
        return this.flag;
    }

    /**
     * Set flag
     *
     * @param flag number of flag
     */
    public void setFlag(int flag)
    {
        this.flag = flag;

        this.notifyObservers("update with flag number: " + flag);
    }

    @Override
    public void register(IObserver obs)
    {
        this.observers.add(obs);
    }

    @Override
    public void unregister(IObserver obs)
    {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers(String message)
    {
        this.observers.stream().forEach((obs)->{obs.update(message);});
    }

    @Override
    public void reset()
    {
        this.observers.clear();
    }
}
