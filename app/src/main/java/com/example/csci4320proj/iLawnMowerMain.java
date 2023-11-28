package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class iLawnMowerMain extends AppCompatActivity {
    private Button chargeButton;
    private TextView chargeText;

    private Button zonesButton;

    private Button otherButton;
    private Button cutButton;



    private TextView zonesText;
    private TextView otherText;
    private TextView cutText;

    private TextView cutLow;
    private TextView cutMedium;
    private TextView cutMaximum;

    private Button lowButton;
    private Button mediumButton;
    private Button maximumButton;


    private Button backButton;

    private Button offButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_lawn_mower); // Set the new layout for this activity

        chargeButton = findViewById(R.id.chargeButton);
        chargeText = findViewById(R.id.chargeText);

        zonesButton = findViewById(R.id.zonesButton);
        otherButton = findViewById(R.id.otherButton);
        cutButton = findViewById(R.id.cutButton);


        zonesText = findViewById(R.id.zonesText);
        otherText = findViewById(R.id.otherText);
        cutText = findViewById(R.id.cutText);

        lowButton = findViewById(R.id.lowButton);
        mediumButton = findViewById(R.id.mediumButton);
        maximumButton = findViewById(R.id.maximumButton);

        cutLow = findViewById(R.id.CutLow);
        cutMedium = findViewById(R.id.cutMedium);
        cutMaximum = findViewById(R.id.cutMaximum);

        offButton = findViewById(R.id.offButton);

        backButton = findViewById(R.id.backButton);


        chargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chargeText.getVisibility() == View.INVISIBLE) {
                    chargeText.setVisibility(View.VISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                }
            }
        });

        zonesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (zonesText.getVisibility() == View.INVISIBLE) {
                    zonesText.setVisibility(View.VISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                }
            }
        });

        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (otherText.getVisibility() == View.INVISIBLE) {
                    otherText.setVisibility(View.VISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                }
            }
        });

        cutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cutText.getVisibility() == View.INVISIBLE) {
                    cutText.setVisibility(View.VISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    zonesText.setVisibility(View.INVISIBLE);
                    otherText.setVisibility(View.INVISIBLE);
                    cutText.setVisibility(View.INVISIBLE);
                }
            }
        });

        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cutLow.getVisibility() == View.INVISIBLE) {
                    cutLow.setVisibility(View.VISIBLE);
                    cutMedium.setVisibility(View.INVISIBLE);
                    cutMaximum.setVisibility(View.INVISIBLE);
                } else {
                    cutLow.setVisibility(View.INVISIBLE);
                    cutMedium.setVisibility(View.INVISIBLE);
                    cutMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cutMedium.getVisibility() == View.INVISIBLE) {
                    cutMedium.setVisibility(View.VISIBLE);
                    cutLow.setVisibility(View.INVISIBLE);
                    cutMaximum.setVisibility(View.INVISIBLE);
                } else {
                    cutLow.setVisibility(View.INVISIBLE);
                    cutMedium.setVisibility(View.INVISIBLE);
                    cutMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        maximumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cutMaximum.getVisibility() == View.INVISIBLE) {
                    cutMaximum.setVisibility(View.VISIBLE);
                    cutLow.setVisibility(View.INVISIBLE);
                    cutMedium.setVisibility(View.INVISIBLE);
                } else {
                    cutLow.setVisibility(View.INVISIBLE);
                    cutMedium.setVisibility(View.INVISIBLE);
                    cutMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cutMaximum.setVisibility(View.INVISIBLE);
                cutLow.setVisibility(View.INVISIBLE);
                cutMedium.setVisibility(View.INVISIBLE);
                zonesText.setVisibility(View.INVISIBLE);
                otherText.setVisibility(View.INVISIBLE);
                cutText.setVisibility(View.INVISIBLE);
                chargeText.setVisibility(View.INVISIBLE);
            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(iLawnMowerMain.this, MainIOTPage.class);
                startActivity(intent);
            }
        });


    }
}

