package corp.siendev.patterns.structural.decorator;

/**
 * Simple implementation for logic game interface
 */
public class LogicGameImpl implements ILogicGame
{
    @Override
    public void start()
    {
        System.out.println("Load the game. Please wait ...");
    }

    @Override
    public void pause()
    {
        System.out.println("No, not now. Press start hurry");
    }

    @Override
    public void exit()
    {
        System.out.println("Good game! See you soon");
    }
}
