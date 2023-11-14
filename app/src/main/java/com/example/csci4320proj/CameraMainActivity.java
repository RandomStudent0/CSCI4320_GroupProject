
package com.example.csci4320proj;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import android.widget.Button;
        import androidx.appcompat.app.AppCompatActivity;

public class CameraMainActivity extends AppCompatActivity {

    private Button recCam1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_camera); //It starts the app here
        // Additional setup for the new activity

        recCam1Button = findViewById(R.id.recCam1Button);

        recCam1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraMainActivity.this, Camera1Rec.class);
                startActivity(intent);
            }
        });
    }
}