package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Register extends AppCompatActivity {
    public static HashMap<String, String> users = new HashMap<String, String>();
    private Button registerButton;
    private EditText editTextnewUsername;
    private EditText editTextnewPassword;
    private Button backLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        editTextnewUsername = findViewById(R.id.editTextnewUsername);
        editTextnewPassword = findViewById(R.id.editTextnewPassword);
        registerButton = findViewById(R.id.buttonRegister);
        backLogin = findViewById(R.id.backLogin);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUser = editTextnewUsername.getText().toString();
                String inputPassword = editTextnewPassword.getText().toString();

                if (inputUser.isEmpty() && inputPassword.isEmpty()) {
                    Toast.makeText(Register.this, "You need to enter a username and password.", Toast.LENGTH_SHORT).show();
                } else if (inputUser.isEmpty()) {
                    Toast.makeText(Register.this, "You need to enter a username.", Toast.LENGTH_SHORT).show();
                } else if (inputPassword.isEmpty()) {
                    Toast.makeText(Register.this, "You need to enter a password.", Toast.LENGTH_SHORT).show();
                } else {
                    if (!MainActivity.users.containsKey(inputUser)) {
                        MainActivity.users.put(inputUser, inputPassword);
                        Toast.makeText(Register.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Register.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Register.this, "Username already exists", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        backLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

