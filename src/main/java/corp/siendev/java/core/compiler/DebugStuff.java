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

package corp.siendev.java.core.compiler;

import java.util.Map;

public class DebugStuff {

    public void getStackTrace() {
        Map<Thread, StackTraceElement[]> stackTraces = Thread.getAllStackTraces();
        for(Thread thread : stackTraces.keySet()) {
            StackTraceElement[] elements = stackTraces.get(thread);
            for (StackTraceElement element : elements) {
                printStackTrace(element);
            }
        }
    }

    public void getStackTraceThrowable() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTraceElements = throwable.getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            printStackTrace(element);
        }
    }

    private void printStackTrace(StackTraceElement element) {
        System.out.println(element.getClassName());
        System.out.println(element.getFileName());
        System.out.println(element.getMethodName());
        System.out.println(element.getLineNumber());
        System.out.println(element.isNativeMethod());
    }
}
