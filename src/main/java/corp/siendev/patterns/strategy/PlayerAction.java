package corp.siendev.patterns.strategy;

/**
 *
 */
public class PlayerAction implements ICharacterAction
{
    public PlayerAction()
    {

    }

    @Override
    public void action()
    {
        System.out.println("I'm highlander and I'll take your head by force");
    }
}
