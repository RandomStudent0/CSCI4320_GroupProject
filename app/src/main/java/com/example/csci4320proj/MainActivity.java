package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static HashMap<String, String> users = new HashMap<String, String>();
    private static List<String> iotList = new ArrayList<>();
    public static List<String> getIotList() {
        return iotList;
    }
    private Button loginButton;
    private Button registerButton;
    private EditText passwordEditText;
    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //It starts the app here

        loginButton = findViewById(R.id.buttonLogin);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputUser = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                if (!users.containsKey(inputUser)) {
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                } else {
                    if (users.get(inputUser).equals(inputPassword)) {
                        Toast.makeText(MainActivity.this, "Login Successful, Welcome " + inputUser, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}