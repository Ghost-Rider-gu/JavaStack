package corp.siendev.patterns;

/**
 * Simple singleton pattern
 */
public class Singleton
{
    private static final Singleton instance = new Singleton();

    /**
     * Empty private constructor
     */
    private Singleton()
    {

    }

    /**
     * Get the Singleton object
     *
     * @return Singleton
     */
    public static Singleton getInstance()
    {
        return instance;
    }
}
