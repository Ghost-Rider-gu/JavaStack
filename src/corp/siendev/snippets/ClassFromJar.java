package corp.siendev.snippets;

import java.io.Serializable;

/**
 * Gets classes from Jar file
 */
public final class ClassFromJar implements Serializable
{
    private static final long serialVersionUID = 45657657785432233L;

    private String jarName;

    /**
     * Default constructor
     */
    public ClassFromJar()
    {

    }

    /**
     * Constructor with parameters
     *
     * @param jarName String
     */
    public ClassFromJar(String jarName)
    {
        this.jarName = jarName;
    }

    public String getJarName()
    {
        return this.jarName;
    }

    public void setJarName(String jarName)
    {
        this.jarName = jarName;
    }

    @Override
    public String toString()
    {
        return "Jar name is " + this.jarName;
    }
}
