package com.uok.se.thisara.smart.smarttraveler.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.uok.se.thisara.smart.smarttraveler.App;
import com.uok.se.thisara.smart.smarttraveler.R;

import javax.inject.Inject;

public class SignInActivity extends AppCompatActivity implements SignInActivityMVP.View{

    @Inject
    SignInActivityMVP.Presenter presenter;
    private GoogleSignInClient googleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        ((App) getApplication()).getApplicationComponent().inject(this);

        Button button = findViewById(R.id.signInButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView textView = findViewById(R.id.textView);

                textView.setText("Click works");
            }
        });

        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .requestId()
                .requestProfile()
                .build();


        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.setView(this);
    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getIdToken() {
        return null;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void invalidSignIn() {

    }

    @Override
    public void validSignIn() {

    }
}
