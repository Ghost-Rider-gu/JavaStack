package corp.siendev.patterns.creational.singleton;

/**
 * Eager singleton.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * Empty private constructor.
     */
    private EagerSingleton() {

    }

    /**
     * Get the singleton object.
     *
     * @return EagerSingleton
     */
    public static EagerSingleton getInstance() {
        return instance;
    }

}
