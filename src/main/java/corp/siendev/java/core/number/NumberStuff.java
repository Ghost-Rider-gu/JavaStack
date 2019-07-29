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

package corp.siendev.java.core.number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberStuff {

    public String getFormattingNumber(Double number, String pattern) {
        DecimalFormat format;
        if ((number % 1) == 0) {
            format = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            format.setMaximumFractionDigits(16);
            return format.format(number);
        } else {
            format = new DecimalFormat(pattern);
            return format.format(number);
        }
    }

    public void numberFormatting(double number) {
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(number);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(number);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(number);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(number);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public void bigNumbers(String firstNumber, String secondNumber) {
        BigInteger one = new BigInteger(firstNumber);
        BigInteger two = new BigInteger(secondNumber);

        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
        System.out.println(one.divide(two));
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public BigDecimal accountantOperation(String firstNumber, String secondNumber, String operation) {
        switch (operation) {
            case "-":
                return new BigDecimal(firstNumber).subtract(new BigDecimal(secondNumber));
            case "+":
                return new BigDecimal(firstNumber).add(new BigDecimal(secondNumber));
            case "/":
                return new BigDecimal(firstNumber).divide(new BigDecimal(secondNumber));
            case "*":
                return new BigDecimal(firstNumber).multiply(new BigDecimal(secondNumber));
            default:
                return new BigDecimal("0.0");
        }
    }
}
