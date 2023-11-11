package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class DeleteIOT extends MainIOTPage {

    private Button deleteIOTButton;
    private EditText editDeleIOTName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_iot); // Set the new layout for this activity
        // Additional setup for the new activity

        deleteIOTButton = findViewById(R.id.deleteIOTButton);
        editDeleIOTName = findViewById(R.id.editDeleIOTName);

        deleteIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> iotList = MainActivity.getIotList();
                String iotName = editDeleIOTName.getText().toString();

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
    }
}