/*
package com.example.csci4320proj;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainIOTPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_iot_page); // Set the new layout for this activity
        // Additional setup for the new activity
    }
}

*/
//The above is the template for a new page. Do not delete it until we turn the project in.
package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainIOTPage extends AppCompatActivity {
    private static List<String> iotList = new ArrayList<>();
    private Button newIOTButton;
    private Button deleteIOTButton;
    private Button editIOTButton;
    private Button listIOTButton;
    private Button logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_iot_page); // Set the new layout for this activity
        // Additional setup for the new activity

        newIOTButton = findViewById(R.id.newIOTButton);
        deleteIOTButton = findViewById(R.id.deleteIOT);
        editIOTButton = findViewById(R.id.editIOTButton);
        listIOTButton = findViewById(R.id.listIOTButton);
        logOutButton = findViewById(R.id.logOutButton);

        newIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, NewIOT.class);
                startActivity(intent);
            }
        });

        deleteIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, DeleteIOT.class);
                startActivity(intent);
            }
        });

        editIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, EditIOT.class);
                startActivity(intent);
            }
        });

        listIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, ListIOT.class);
                startActivity(intent);
            }
        });

        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainIOTPage.this, "You have successfully logged out!", Toast.LENGTH_SHORT).show();
                //Implement log out database here
            }
        });
    }
}