package com.example.csci4320proj;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ListIOT extends MainIOTPage {
    private EditText listIOTs;
    private Button backMainIOT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_iot); // Set the new layout for this activity
        // Additional setup for the new activity

            listIOTs = findViewById(R.id.listIOTs);
            backMainIOT = findViewById(R.id.backMainIOT);


            // Displays the IOT list in the page
            StringBuilder iotString = new StringBuilder();
            List<String> iotList = MainActivity.getIotList();
            for (String iot : iotList) {
                iotString.append(iot).append("\n");
            }
            listIOTs.setText(iotString.toString());

        backMainIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListIOT.this, MainIOTPage.class);
                startActivity(intent);
            }
        });
    }
}

