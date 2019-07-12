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

package corp.siendev.java.core.filesystem;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;

public class JarUtils {

    public static void main(String[] args) {

    }

    public static List<String> getClassesNamesFromJar(String jarName) {
        List<String> listOfClasses = new ArrayList<>();
        try(JarInputStream jarInputStream = new JarInputStream(new FileInputStream(jarName))) {
            JarEntry jarEntry;

            while (true) {
                jarEntry = jarInputStream.getNextJarEntry();
                if (jarEntry == null) {
                    break;
                }
                if ((jarEntry.getName().endsWith(".class"))) {
                    String className = jarEntry.getName().replaceAll("/", "\\.");
                    String myClass = className.substring(0, className.lastIndexOf('.'));
                    listOfClasses.add(myClass);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error:: " + ex.getMessage());
        }
        return listOfClasses;
    }

    public void anotherWayToGetClasses(String jarFilePath) throws Exception {
        try(JarFile jarFile = new JarFile(jarFilePath)) {
            Enumeration<JarEntry> e = jarFile.entries();

            URL[] urls = { new URL("jar:file:" + jarFilePath +"!/") };
            URLClassLoader cl = URLClassLoader.newInstance(urls);

            while (e.hasMoreElements()) {
                JarEntry je = e.nextElement();
                if(je.isDirectory() || !je.getName().endsWith(".class")){
                    continue;
                }
                String className = je.getName().substring(0,je.getName().length()-6);
                //className = className.replace('/', '.');
                //Class c = cl.loadClass(className);
            }
        } catch (Exception ex) {
            throw  new Exception(ex.getMessage());
        }

    }

    public void getInvokeMethod(String className, String methodName) {
        try {
            Class<?> clazz = Class.forName(className);
            Method main = clazz.getDeclaredMethod(methodName);
            main.invoke(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
