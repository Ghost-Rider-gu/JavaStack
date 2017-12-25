package corp.siendev.patterns.behavioral.templateMethod;

/**
 *
 */
public abstract class BasicLogicCharacter
{
    protected abstract void createCharacter(TypeGameCharacter typeCharacter);
    protected abstract void renderCharacter();

    public final void updateMap()
    {
        System.out.println("New character was created.");
    }
}
