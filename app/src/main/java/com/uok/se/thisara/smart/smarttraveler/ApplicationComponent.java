package com.uok.se.thisara.smart.smarttraveler;

import com.uok.se.thisara.smart.smarttraveler.authentication.SignInActivity;
import com.uok.se.thisara.smart.smarttraveler.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by malware on 3/1/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SignInActivity signInActivity);
}
