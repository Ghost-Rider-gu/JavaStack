package corp.siendev.patterns.singleton;

/**
 * Simple singleton pattern
 */
public class SimpleSingleton
{
    private static final SimpleSingleton instance = new SimpleSingleton();

    /**
     * Empty private constructor
     */
    private SimpleSingleton()
    {

    }

    /**
     * Get the Singleton object
     *
     * @return Singleton
     */
    public static SimpleSingleton getInstance()
    {
        return instance;
    }
}
