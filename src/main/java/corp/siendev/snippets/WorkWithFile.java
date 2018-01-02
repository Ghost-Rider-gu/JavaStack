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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection methods for work with file (sort data, reading, writing, etc.)
 *
 * WorkWithFile.java
 *
 * @author Ghost Rider
 */
public class WorkWithFile implements Serializable
{
    private static final long serialVersionUID = -244687122450234L;
    private String fileName;

    public WorkWithFile()
    {

    }

    public WorkWithFile(String fileName)
    {
        this.fileName = fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    /**
     * Sorting data into the file (use java.io)
     */
    public void sortFileDataIo()
    {
        this.checkFileName(this.fileName);

        String lineFromFile;
        List<String> lineList= new ArrayList<>();

        try(BufferedReader file = new BufferedReader(new FileReader(this.fileName))) {
            while ((lineFromFile = file.readLine()) != null) {
                lineList.add(lineFromFile);
            }
            Collections.sort(lineList); // Sorting line from file
            lineList.stream().forEach((value)->{System.out.println(value);}); // Output data
        } catch(IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    /**
     * Sorting data into the file (use java.nio)
     */
    public void sortFileDataNio()
    {
        this.checkFileName(this.fileName);

        Path pathFile = Paths.get(this.fileName);

        try {
            List<String> allLines = Files.readAllLines(pathFile);
            Collections.sort(allLines);
            allLines.stream().forEach((value)->{System.out.println(value);}); // Output data
        } catch(IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString()
    {
        return "You work with: " + this.fileName;
    }

    private void checkFileName(String fileName)
    {
        if(fileName == null) {
            throw new IllegalArgumentException("File name doesn't be empty. Please, set filename for work");
        }
    }
}
