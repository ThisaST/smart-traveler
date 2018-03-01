package com.uok.se.thisara.smart.smarttraveler.authentication;

import com.uok.se.thisara.smart.smarttraveler.models.User;

/**
 * Created by malware on 3/1/18.
 */

public interface SignInActivityMVP {

    interface View {

        String getUserId();
        String getEmail();
        String getIdToken();
        String getUserName();



        void invalidSignIn();
        void validSignIn();

    }

    interface Presenter {

        void setView(SignInActivityMVP.View view);
        void signInButtonClick();
        void getCurrentUser();

    }

    interface Model {

        void createUser(String userId,String email, String idToken, String userName);
        User getUser();
    }
}
