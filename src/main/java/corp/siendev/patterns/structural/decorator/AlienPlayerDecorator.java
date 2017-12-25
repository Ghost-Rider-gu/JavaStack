package corp.siendev.patterns.structural.decorator;

/**
 * Simple decorator
 */
public class AlienPlayerDecorator extends PlayerDecorator
{
    public AlienPlayerDecorator(ILogicGame game)
    {
        super(game);
    }

    @Override
    public void start()
    {
        super.start();
    }

    @Override
    public void pause()
    {
        super.pause();
    }

    @Override
    public void exit()
    {
        super.exit();
    }

    @Override
    public void createNewPlayer()
    {
        System.out.println("An alien was created");
    }
}
