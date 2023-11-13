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


//Another version
/*
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

        //REGISTER REMOVE
        // Set onClickListener for the login button
        registerButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Register.class);
                        //Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
            }

        });

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                String inputUser = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                if (users.containsKey(usernameEditText)) {
                    String storedPassword = users.get(inputUser);
                    if (inputPassword.equals(storedPassword)) {
                        Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                    } else {
                        Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });

    }
}
*/

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
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);

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
