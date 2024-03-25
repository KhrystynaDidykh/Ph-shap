package com.example.trial_app;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private EditText userEmaiEditText;
    private EditText passwordEditText;
    private TextView forgotPasswordTextView;
    private TextView signUpTextView;
    private Button loginButton;
    private CheckBox keepSignedInCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmaiEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextNumberPassword);
        forgotPasswordTextView = findViewById(R.id.ForgotYourPassword);
        signUpTextView = findViewById(R.id.signUp);
        loginButton = findViewById(R.id.button);
        keepSignedInCheckBox = findViewById(R.id.checkBox);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userEmaiEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
                    return;
                }
                //  login logic

                String message = "Username: " + username + "\nPassword: " + password;
                Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgotPassword.class));
            }
        });
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CreateNewAccount.class));
            }
        });

        keepSignedInCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
            } else {
            }
        });
    }

}