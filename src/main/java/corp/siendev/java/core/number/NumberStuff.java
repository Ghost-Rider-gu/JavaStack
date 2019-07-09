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

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
}
