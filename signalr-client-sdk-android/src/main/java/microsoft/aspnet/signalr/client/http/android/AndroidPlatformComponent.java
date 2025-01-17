/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
See License.txt in the project root for license information.
*/

package microsoft.aspnet.signalr.client.http.android;

import microsoft.aspnet.signalr.client.Logger;
import microsoft.aspnet.signalr.client.Platform;
import microsoft.aspnet.signalr.client.PlatformComponent;
import microsoft.aspnet.signalr.client.http.HttpConnection;

public class AndroidPlatformComponent implements PlatformComponent {

    @Override
    public HttpConnection createHttpConnection(Logger logger) {
        return Platform.createDefaultHttpConnection(logger);
    }

    @Override
    public String getOSName() {
        return "android";
    }
}
