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
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainIOTPage extends AppCompatActivity {
    private static List<String> iotList = new ArrayList<>();
    private Button newIOTButton;
    private Button deleteIOTButton;
    private Button editIOTButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_iot_page); // Set the new layout for this activity
        // Additional setup for the new activity


        newIOTButton = findViewById(R.id.newIOT);
        deleteIOTButton = findViewById(R.id.deleteIOT);
        editIOTButton = findViewById(R.id.editIOTButton);

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

    }
}