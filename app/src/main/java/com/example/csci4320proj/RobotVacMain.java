package com.example.csci4320proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RobotVacMain extends AppCompatActivity {
    private Button chargeButton;
    private TextView chargeText;

    private Button mBedRoomButton;

    private Button bedRoomButton;
    private Button livingRoomButton;



    private TextView mBedRoomText;
    private TextView bedRoomText;
    private TextView livingRoomText;

    private TextView suctionQuiet;
    private TextView suctionMedium;
    private TextView suctionMaximum;
    private Button quietButton;
    private Button mediumButton;
    private Button maximumButton;

    private Button backButton;

    private Button offButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robot_vac); // Set the new layout for this activity

        chargeButton = findViewById(R.id.chargeButton);
        chargeText = findViewById(R.id.chargeText);

        mBedRoomButton = findViewById(R.id.mBedRoomButton);
        bedRoomButton = findViewById(R.id.bedRoomButton);
        livingRoomButton = findViewById(R.id.livingRoomButton);


        mBedRoomText = findViewById(R.id.mBedRoomText);
        bedRoomText = findViewById(R.id.bedRoomText);
        livingRoomText = findViewById(R.id.livingRoomText);

        quietButton = findViewById(R.id.quietButton);
        mediumButton = findViewById(R.id.mediumButton);
        maximumButton = findViewById(R.id.maximumButton);

        suctionQuiet = findViewById(R.id.suctionQuiet);
        suctionMedium = findViewById(R.id.suctionMedium);
        suctionMaximum = findViewById(R.id.suctionMaximum);

        offButton = findViewById(R.id.offButton);

        backButton = findViewById(R.id.backButton);


        chargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chargeText.getVisibility() == View.INVISIBLE) {
                    chargeText.setVisibility(View.VISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                }
            }
        });

        mBedRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBedRoomText.getVisibility() == View.INVISIBLE) {
                    mBedRoomText.setVisibility(View.VISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                }
            }
        });

        bedRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bedRoomText.getVisibility() == View.INVISIBLE) {
                    bedRoomText.setVisibility(View.VISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                }
            }
        });

        livingRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (livingRoomText.getVisibility() == View.INVISIBLE) {
                    livingRoomText.setVisibility(View.VISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    chargeText.setVisibility(View.INVISIBLE);
                } else {
                    chargeText.setVisibility(View.INVISIBLE);
                    mBedRoomText.setVisibility(View.INVISIBLE);
                    bedRoomText.setVisibility(View.INVISIBLE);
                    livingRoomText.setVisibility(View.INVISIBLE);
                }
            }
        });

        quietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionQuiet.getVisibility() == View.INVISIBLE) {
                    suctionQuiet.setVisibility(View.VISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionMedium.getVisibility() == View.INVISIBLE) {
                    suctionMedium.setVisibility(View.VISIBLE);
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        maximumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suctionMaximum.getVisibility() == View.INVISIBLE) {
                    suctionMaximum.setVisibility(View.VISIBLE);
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                } else {
                    suctionQuiet.setVisibility(View.INVISIBLE);
                    suctionMedium.setVisibility(View.INVISIBLE);
                    suctionMaximum.setVisibility(View.INVISIBLE);
                }
            }
        });

        offButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suctionMaximum.setVisibility(View.INVISIBLE);
                suctionQuiet.setVisibility(View.INVISIBLE);
                suctionMedium.setVisibility(View.INVISIBLE);
                mBedRoomText.setVisibility(View.INVISIBLE);
                bedRoomText.setVisibility(View.INVISIBLE);
                livingRoomText.setVisibility(View.INVISIBLE);
                chargeText.setVisibility(View.INVISIBLE);
            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RobotVacMain.this, MainIOTPage.class);
                startActivity(intent);
            }
        });


    }
}

