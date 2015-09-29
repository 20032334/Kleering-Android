package com.melotic.klerring;

import android.app.Application;

/**
 * Created by penghui on 15/9/10.
 */
public class App extends Application {
    static App app;

    @Override
    public void onCreate() {
        app = this;
        super.onCreate();
        KleeringSession.instance();
    }

    public static App Instance() {
        if (app == null)
            app = new App();
        return app;
    }
}
