package com.example.csci4320proj;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.List;

public class EditIOT extends MainIOTPage {
    private Button editIOTButton;
    private EditText editIOTName;
    private Button backMainIOT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_iot);

        editIOTButton = findViewById(R.id.editIOTButton);
        editIOTName = findViewById(R.id.editIOTName);
        backMainIOT = findViewById(R.id.backMainIOT);

        editIOTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> iotList = MainActivity.getIotList();
                String oldIOTName = editIOTName.getText().toString(); // Fetch the entered IOT name from the EditText

                if (iotList.contains(oldIOTName)) {
                    editIOTName.getText().clear(); // Clear the EditText field
                    Toast.makeText(EditIOT.this, "Enter a new IOT name.", Toast.LENGTH_SHORT).show();

                    editIOTButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String newIOTName = editIOTName.getText().toString(); // Fetch the new IOT name from the same EditText

                            if (iotList.contains(newIOTName)) {
                                Toast.makeText(EditIOT.this, "The IOT name already exists", Toast.LENGTH_SHORT).show();
                            } else {
                                int index = iotList.indexOf(oldIOTName);
                                iotList.set(index, newIOTName);
                                Toast.makeText(EditIOT.this, "IOT " + oldIOTName + " has been changed to " + newIOTName + ".", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(EditIOT.this, MainIOTPage.class);
                                startActivity(intent);
                            }
                        }
                    });
                } else {
                    Toast.makeText(EditIOT.this, "IOT Name not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backMainIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditIOT.this, MainIOTPage.class);
                startActivity(intent);
            }
        });
    }
}

