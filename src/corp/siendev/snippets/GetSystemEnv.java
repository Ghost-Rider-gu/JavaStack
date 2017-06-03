package corp.siendev.snippets;

import java.io.Serializable;
import java.util.Map;

/**
 * How get system environment
 */
public class GetSystemEnv implements Serializable
{
    private static final long serialVersionUID = 5315935929308772L;

    /**
     * Store for all our system environment
     */
    private Map<String, String> envParams;

    /**
     * Store for one of system environment
     */
    private String envParamName;

    /**
     * Constructor without parameters (get all system env)
     */
    public GetSystemEnv()
    {
        this.envParams = System.getenv();
    }

    /**
     * Constructor with parameters (get one of system env)
     *
     * @param envParamName String
     */
    public GetSystemEnv(String envParamName)
    {
        this.checkParam(envParamName);
    }

    /**
     * Set one of system env
     *
     * @param envParamName String
     */
    public void setEnvParamName(String envParamName)
    {
        this.checkParam(envParamName);
    }

    /**
     * Get one of our system env
     *
     * @return String
     */
    public String getEnvParamName()
    {
        return System.getenv(this.envParamName);
    }

    /**
     * Get all system env
     *
     * @return Map
     */
    public Map<String, String> getEnvParams()
    {
        if(this.envParams.isEmpty()) {
            this.envParams = System.getenv();

            return this.envParams;
        } else {
            return this.envParams;
        }
    }

    /**
     * Print all our system env
     */
    public void printSystemEnv()
    {
        if(this.envParams.isEmpty()) {
            System.out.println("We have only one env parameter: " + this.envParamName);
        } else {
            for (Map.Entry<String,String> entry : this.envParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                System.out.println("Key=" + key + " | Value=" + value);
            }
        }
    }

    /**
     * Check our parameters
     *
     * @param paramName String
     */
    private void checkParam(String paramName)
    {
        if(paramName == null || paramName.isEmpty()) {
            throw new IllegalArgumentException("paramName cannot be null or empty");
        } else {
            this.envParamName = paramName;
        }
    }
}
