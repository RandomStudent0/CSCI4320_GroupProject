package com.example.csci4320proj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RobotVacMain extends AppCompatActivity {
    private Switch sw1;
    private Switch sw2;
    private Switch sw3;
    private Switch sw4;
    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testrobotvac); // Set the new layout for this activity

        sw1 = findViewById(R.id.sw1);
        sw2 = findViewById(R.id.sw2);
        sw3 = findViewById(R.id.sw3);
        sw4 = findViewById(R.id.sw4);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        //if charge switch is on, then other switches off and charge is visible
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //action with switch on/off
                if(b) {
                    //other switches false
                    text1.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    sw2.setChecked(false);
                    sw3.setChecked(false);
                    sw4.setChecked(false);
                } else {
                    //if off
                    text1.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                }
            }
            });

        //if room 1 switch is on, then other switches off and cleaning is visible
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //action with switch on/off
                if(b) {
                    //other switches false
                    text2.setVisibility(View.VISIBLE);
                    sw1.setChecked(false);
                    sw3.setChecked(false);
                    sw4.setChecked(false);
                } else {
                    //if off
                    text2.setVisibility(View.INVISIBLE);
                    text1.setVisibility(View.INVISIBLE);
                }
            }
        });

        //if room 2 switch is on, then other switches off and cleaning is visible
        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //action with switch on/off
                if(b) {
                    //other switches false
                    text2.setVisibility(View.VISIBLE);
                    sw1.setChecked(false);
                    sw2.setChecked(false);
                    sw4.setChecked(false);
                } else {
                    //if off
                    text1.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                }
            }
        });

        //if room 3 switch is on, then other switches off and cleaning is visible
        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //action with switch on/off
                if(b) {
                    //other switches false
                    text2.setVisibility(View.VISIBLE);
                    sw1.setChecked(false);
                    sw2.setChecked(false);
                    sw3.setChecked(false);
                } else {
                    //if off
                    text1.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);

                }
            }
        });

        // Additional setup for the new activity
    }
}

//The above is the template for a new page. Do not delete it until we turn the project in.
