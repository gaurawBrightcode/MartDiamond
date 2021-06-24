package com.ecommerce.martdiamond.model;

import android.app.Application;

public class SriHariOmApplication extends Application {
    private static SriHariOmApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Globals.init(this);
    }

    public static synchronized SriHariOmApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }


}

