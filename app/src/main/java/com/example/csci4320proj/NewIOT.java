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

public class NewIOT extends MainIOTPage {

    private Button createIOTButton;
    private EditText editNewIOTName;
    private Button backMainIOT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_iot); // Set the new layout for this activity
        // Additional setup for the new activity

        createIOTButton = findViewById(R.id.newIOTButton);
        editNewIOTName = findViewById(R.id.editNewIOTName);
        backMainIOT = findViewById(R.id.backMainIOT);
        createIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> iotList = MainActivity.getIotList();
                String iotName = editNewIOTName.getText().toString();

                if(iotList.contains(iotName)){
                    Toast.makeText(NewIOT.this, "IOT Name already exists", Toast.LENGTH_SHORT).show();
                } else {
                    iotList.add(iotName);
                    Toast.makeText(NewIOT.this, "New IOT: " + iotName + " has been created.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(NewIOT.this, MainIOTPage.class);
                    startActivity(intent);
                }
            }
        });

        backMainIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewIOT.this, MainIOTPage.class);
                startActivity(intent);
            }
        });
    }
}