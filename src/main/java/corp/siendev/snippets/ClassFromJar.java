/*
 * Copyright (c) 2018 SienDev company. All rights reserved.
 *
 * This is a free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
*/
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
