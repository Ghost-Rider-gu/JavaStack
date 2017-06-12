package corp.siendev.snippets;

import java.io.IOException;

/**
 * Collection of mini-utils (just for fun)
 */
public class MiniUtils
{
    /**
     * Current Runtime object
     */
    private Runtime rtime = Runtime.getRuntime();

    /**
     * Terminate the currently running JVM (also we'll use System.exit() )
     */
    public void breakJVM()
    {
        rtime.halt(1);
    }

    /**
     * Execute program
     *
     * @param programName name of program
     *
     * @return object like Process
     *
     * @throws IOException don't forget about exception
     */
    public Process execProgram(String programName) throws IOException
    {
        return rtime.exec(programName);
    }

    /**
     * Another method for execute program
     *
     * @param programName name of program
     *
     * @return object like Process
     *
     * @throws IOException don't forget about exception
     */
    public Process alternativeExecProgram(String programName) throws IOException
    {
        ProcessBuilder processBuild = new ProcessBuilder(programName);

        return processBuild.start();
    }

    /**
     * Get free memory for use
     *
     * @return free memory in MegaBytes
     */
    public String getFreeMemory()
    {
        long freeMem = rtime.freeMemory();
        long memoryInMegaBytes = freeMem / (1024 * 1024);

        return "Free memory: " + memoryInMegaBytes;
    }

    /**
     * Get total memory for use
     *
     * @return total memory in MegaBytes
     */
    public String getTotalMemory()
    {
        long totalMem = rtime.totalMemory();
        long memoryInMegaBytes = totalMem / (1024 * 1024);

        return "Total memory" + memoryInMegaBytes;
    }
}
