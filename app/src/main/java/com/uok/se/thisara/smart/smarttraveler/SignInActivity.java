package com.uok.se.thisara.smart.smarttraveler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button button = findViewById(R.id.signInButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView textView = findViewById(R.id.textView);

                textView.setText("Click works");
            }
        });
    }
}
