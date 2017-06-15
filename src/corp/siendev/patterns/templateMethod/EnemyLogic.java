package corp.siendev.patterns.templateMethod;

/**
 *
 */
public class EnemyLogic extends BasicLogicCharacter
{
    @Override
    protected void createCharacter(TypeGameCharacter typeCharacter)
    {
        System.out.println("Creating a new character: " + typeCharacter.name());
    }

    @Override
    protected void renderCharacter()
    {
        System.out.println("Rendering the new character ...");
    }
}
