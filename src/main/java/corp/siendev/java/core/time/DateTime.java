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

package corp.siendev.java.core.time;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateTime {

    public String getDayOfWeek(int year, int month, int day) throws DateTimeException {
        int dayValue = LocalDate.of(year, month, day).getDayOfWeek().getValue();
        switch (dayValue) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                return "UNKNOWN";
            }
    }
}
