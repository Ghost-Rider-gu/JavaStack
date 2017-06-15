package corp.siendev.patterns.strategy;

/**
 *
 */
public class ActionComplete
{
    private ICharacterAction action;

    public void setAction(ICharacterAction action)
    {
        this.action = action;
    }

    public void doAction()
    {
        action.action();
    }
}
