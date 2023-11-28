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
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainIOTPage extends AppCompatActivity {
    private static List<String> iotList = new ArrayList<>();
    private Button newIOTButton;
    private Button deleteIOTButton;
    private Button editIOTButton;
    private Button listIOTButton;
    private Button enterCameraIOT;
    private Button enterRobotVacIOT;
    private Button enterARGlassesIOT;
    private Button enteriLawnMowerIOT;

    private Switch enDisIOTSwitch;
    private Switch enDisIOTNotiSwitch;
    //Uncomment these when the IOTs are finished

    private Button logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_iot_page); // Set the new layout for this activity
        // Additional setup for the new activity

        //ArrayList buttons
        newIOTButton = findViewById(R.id.newIOTButton);
        deleteIOTButton = findViewById(R.id.deleteIOT);
        editIOTButton = findViewById(R.id.editIOTButton);
        listIOTButton = findViewById(R.id.listIOTButton);

        //Enter IOTs
        enterCameraIOT = findViewById(R.id.enterCameraIOT);
        enterRobotVacIOT = findViewById(R.id.enterRobotVacIOT);
        enterARGlassesIOT = findViewById(R.id.enterARGlassesIOT);
        enteriLawnMowerIOT = findViewById(R.id.enteriLawnMowerIOT);

        //Logout button
        logOutButton = findViewById(R.id.logOutButton);

        //Switches
        enDisIOTSwitch = findViewById(R.id.enDisIOTSwitch);
        enDisIOTNotiSwitch = findViewById(R.id.enDisIOTNotiSwitch);

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

        enterCameraIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, CameraMainActivity.class);
                startActivity(intent);
            }
        });

        //Below is the template for new IOTs, you just change the activity class name in the
        //Intent to your own, and you should be able to link your new IOT there.

        enterRobotVacIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, RobotVacMain.class);
                startActivity(intent);
            }
        });
/* UNCOMMENT WHEN FINISHED THE TWO IOTS
        enterARGlassesIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, yourMainActivity.class);
                startActivity(intent);
            }
        });
        */


         enteriLawnMowerIOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, iLawnMowerMain.class);
                startActivity(intent);
            }
        });


        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainIOTPage.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainIOTPage.this, "You have successfully logged out!", Toast.LENGTH_SHORT).show();
            }
        });



        enDisIOTSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //if true
                if(b) {
                    //
                    Toast.makeText(MainIOTPage.this, "Enabled IOTs", Toast.LENGTH_SHORT).show();
                    enDisIOTSwitch.setChecked(true);
                } else {
                    //if false or else
                    Toast.makeText(MainIOTPage.this, "Disabled IOTs", Toast.LENGTH_SHORT).show();
                    enDisIOTSwitch.setChecked(false);
                }
            }
        });

        enDisIOTNotiSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //enable notis
                if(b) {
                    //
                    Toast.makeText(MainIOTPage.this, "Enabled Notifications", Toast.LENGTH_SHORT).show();
                    enDisIOTNotiSwitch.setChecked(true);
                } else {
                    //disable notis
                    Toast.makeText(MainIOTPage.this, "Disabled Notifications", Toast.LENGTH_SHORT).show();
                    enDisIOTNotiSwitch.setChecked(false);
                }
            }
        });

    }
}