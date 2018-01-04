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

package corp.siendev.java.core.io;

import java.io.Console;
import java.util.Scanner;

public class SimpleIO {

    public static void main(String[] args) {
        useConsole();
        System.out.println(useScanner());
    }

    private static void useConsole() {
        Console console = System.console();

        String userLogin = console.readLine("User name: ");
        char[] userPassword = console.readPassword("User password: ");

        System.out.printf("User name is %s, user password is %s", userLogin, userPassword);
    }

    private static String useScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your login to access you data...");
        String userLogin = scanner.nextLine();

        System.out.println("Now input your password ...");
        int userPassword = scanner.nextInt();

        return String.format("Your login is %s, your password is %d", userLogin, userPassword);
    }
}
