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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        editTextnewUsername = findViewById(R.id.editTextnewUsername);
        editTextnewPassword = findViewById(R.id.editTextnewPassword);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                String inputUser = editTextnewUsername.getText().toString();
                String inputPassword = editTextnewPassword.getText().toString();

                if(!MainActivity.users.containsKey(inputUser)) {
                    MainActivity.users.put(inputUser, inputPassword);
                    Toast.makeText(Register.this, "Registration successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Register.this, "Username already exits", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}

