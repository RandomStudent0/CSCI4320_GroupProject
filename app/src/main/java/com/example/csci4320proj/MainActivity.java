/*
package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText passwordEditText;
    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the login button, username, and password EditText
        //In the xml file, it is android:id="@+id/buttonLogin" and the same button for the listener
        loginButton = findViewById(R.id.buttonLogin);
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                String validPassword = "pass";
                String enteredPassword = passwordEditText.getText().toString();

                String validUsername = "user";
                String enteredUsername = usernameEditText.getText().toString();

                if (enteredPassword.equals(validPassword) && enteredUsername.equals(validUsername)) {
                    // If password and username are correct, navigate to the next java file
                    Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                    startActivity(intent); //Go to next page
                } else {
                    // If password or username is incorrect, show an error message
                    //Object toast is the feedback message
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

*/

//Remove the above later, it is code that works
package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public static HashMap<String, String> users = new HashMap<String, String>();
    private Button loginButton;
    private Button registerButton;
    private EditText passwordEditText;
    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the login button, username, and password EditText
        //In the xml file, it is android:id="@+id/buttonLogin" and the same button for the listener
        loginButton = findViewById(R.id.buttonLogin);
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);

        registerButton = findViewById(R.id.buttonRegister);
/*
        //REGISTER REMOVE
        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                String newU
                String validPassword = "pass";
                String enteredPassword = passwordEditText.getText().toString();

                String validUsername = "user";
                String enteredUsername = usernameEditText.getText().toString();

                if (!users.containsKey(usernameEditText)) {
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                } else {
                    if (users.get(usernameEditText).equals(passwordEditText)) {
                        Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                        Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }

                }
            }
        });*/

        //REGISTER REMOIVE


        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                if (!users.containsKey(usernameEditText)) {
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                } else {
                    if (users.get(usernameEditText).equals(passwordEditText)) {
                        Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                        Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }

                }
            }
        });

    }
}

