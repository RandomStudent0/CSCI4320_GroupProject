package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class DeleteIOT extends MainIOTPage {
    private Button deleteIOTButton;
    private EditText editDeleteIOTName;
    private Button backMainIOT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_iot); // Set the new layout for this activity
        // Additional setup for the new activity

        deleteIOTButton = findViewById(R.id.deleteIOTButton);
        editDeleteIOTName = findViewById(R.id.editDeleteIOTName);
        backMainIOT = findViewById(R.id.backMainIOT);

        deleteIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> iotList = MainActivity.getIotList();
                String iotName = editDeleteIOTName.getText().toString();

                if (iotList.contains(iotName)) {
                    iotList.remove(iotName);
                    Toast.makeText(DeleteIOT.this, "Deleted IOT " + iotName + ".", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DeleteIOT.this, MainIOTPage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(DeleteIOT.this, "IOT Name not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backMainIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DeleteIOT.this, MainIOTPage.class);
                startActivity(intent);
            }
        });
    }
}