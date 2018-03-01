package com.uok.se.thisara.smart.smarttraveler.authentication;


import android.support.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;

/**
 * Created by malware on 3/1/18.
 */

public class SignInActivityPresenter implements SignInActivityMVP.Presenter{

    private GoogleSignInClient googleSignInClient;

    @Nullable
    private SignInActivityMVP.View view;
    private SignInActivityMVP.Model model;

    public SignInActivityPresenter(SignInActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(SignInActivityMVP.View view) {

        this.view = view;
    }

    @Override
    public void signInButtonClick() {


    }

    @Override
    public void getCurrentUser() {

    }
}
