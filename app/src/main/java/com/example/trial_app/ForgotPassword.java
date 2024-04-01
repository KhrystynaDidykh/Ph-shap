package com.example.trial_app;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ForgotPassword extends AppCompatActivity {
    private TextView forgotPasswordPage;
    private EditText editTextTextEmailAddress;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        
        String forgotPasswordPage = findViewById(R.id.ForgotPasswordPage).toString();
        String editTextTextEmailAddress = 
                findViewById(R.id.editTextTextEmailAddress_forgotPage).toString();
        resetButton = findViewById(R.id.ResetPasswordButton);
        if (!forgotPasswordPage.isEmpty() || checkEmailInDatabase("email")) {
            throw new RuntimeException();
        }
        sendConfirmationEmail(editTextTextEmailAddress);
    }

    //LOGIC for check is such email in database
    public static boolean checkEmailInDatabase(String email) {
        return false;
    }

    public static boolean sendConfirmationEmail(String userEmail) {
        return true;
    }

}