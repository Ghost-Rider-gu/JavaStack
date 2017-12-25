package corp.siendev.patterns.structural.decorator;

/**
 * Simple decorator
 */
public class PlayerDecorator implements ILogicGame
{
    private ILogicGame game;

    public PlayerDecorator(ILogicGame game)
    {
        this.game = game;
    }

    @Override
    public void start()
    {
        this.game.start();
    }

    @Override
    public void pause()
    {
        this.game.pause();
    }

    @Override
    public void exit()
    {
        this.game.exit();
    }

    public void createNewPlayer()
    {
        System.out.println("New player was created");
    }
}
