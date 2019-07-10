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

package corp.siendev.java.core.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingStuff {

    public String getIpAddress() throws UnknownHostException {
        InetAddress IP = InetAddress.getLocalHost();
        return IP.getHostAddress();
    }
}
