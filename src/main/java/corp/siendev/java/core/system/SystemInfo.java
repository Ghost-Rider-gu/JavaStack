/*
 * Copyright (c) 2019 SienDev company. All rights reserved.
 *
 * This is a free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 */

package corp.siendev.java.core.system;

/**
 * Information about your system
 */
public final class SystemInfo
{
    /**
     *
     */
    private final String osSeparator = System.lineSeparator();

    /**
     * Constructor
     */
    public SystemInfo()
    {

    }

    public String getOsSeparator()
    {
        return this.osSeparator;
    }

    public long getMemoryTotal()
    {
        return Runtime.getRuntime().totalMemory();
    }

    public String getOsName()
    {
        return System.getProperty("os.name");
    }

    public String getOsVersion()
    {
        return System.getProperty("os.version");
    }

    public String getUserName()
    {
        return System.getProperty("user.name");
    }

    public String getArchSystem()
    {
        return System.getProperty("os.arch");
    }
}
