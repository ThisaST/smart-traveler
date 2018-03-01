package com.uok.se.thisara.smart.smarttraveler;

import android.app.Application;

import com.uok.se.thisara.smart.smarttraveler.modules.ApplicationModule;
import com.uok.se.thisara.smart.smarttraveler.modules.SignInModule;

/**
 * Created by malware on 3/1/18.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .signInModule(new SignInModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
