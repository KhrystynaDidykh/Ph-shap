package com.example.trial_app;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView signUp;
    private TextView ForgotYourPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(v -> {
            // Start the new activity
            Intent intent = new Intent(MainActivity.this, CreateNewAccount.class);
            startActivity(intent);
        });
        ForgotYourPassword = findViewById(R.id.ForgotYourPassword);
        ForgotYourPassword.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
            startActivity(intent);
        });
    }

}