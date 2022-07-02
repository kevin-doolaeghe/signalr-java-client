# ASP.NET SignalR library for Java & Android

## Introduction

This is is a fork of the original Microsoft SignalR java library.

I upgraded the `Gson` library and removed old WebSocket library.  
 
**Note :** This library is NOT compatible with [ASP.NET Core SignalR 2.0](https://github.com/aspnet/SignalR/issues/883#issuecomment-336499189).  
Read [this](https://docs.microsoft.com/fr-fr/aspnet/core/signalr/version-differences?view=aspnetcore-6.0) article for more information about the differences between ASP.NET SignalR and ASP.NET Core SignalR.

ASP.NET SignalR is a new library for ASP.NET developers that makes it incredibly simple to add real-time web functionality to your applications.

What is "real-time web" functionality ?  
It's the ability to have your server-side code push content to the connected clients as it happens, in real-time.

## What can it be used for ?

Pushing data from the server to the client (not just browser clients) has always been a tough problem. SignalR makes 
it dead easy and handles all the heavy lifting for you.

This library can be used from **both regular Java or Android applications**.

## Documentation

See the related documentation given by Microsoft [here](http://asp.net/signalr).
	
## LICENSE

Apache 2.0 License

## Building the source

* Clone this repository

* Open Android Studio and select the cloned directory

* Build the project

  * The `signalr-client-sdk.jar` will be generated inside the `/signalr-client-sdk/build/libs` folder

  * The `signalr-client-sdk-android.aar` will be generated inside the `/signalr-client-sdk-android/build/outputs/aar` folder

## Using the library in a Java application :

Add the `signalr-client-sdk.jar` and `Gson` library to the Gradle dependencies of the project.

## Using the library in an Android application :

Add the `signalr-client-sdk.jar`, `signalr-client-sdk-android.jar` and `Gson` library to the Gradle dependencies of the project.

In the code, before using the library, you must initialize the platform to use android-specific libraries :

```
Platform.loadPlatformComponent(new AndroidPlatformComponent());
```

## 
