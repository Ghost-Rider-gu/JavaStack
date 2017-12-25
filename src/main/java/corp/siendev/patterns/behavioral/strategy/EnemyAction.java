package corp.siendev.patterns.behavioral.strategy;

/**
 *
 */
public class EnemyAction implements ICharacterAction
{
   public EnemyAction()
   {

   }

    @Override
    public void action()
    {
        System.out.println("The enemy is weak and do not attack");
    }
}
