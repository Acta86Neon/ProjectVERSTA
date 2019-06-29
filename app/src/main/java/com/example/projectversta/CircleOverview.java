package com.example.projectversta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CircleOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_overview);

        Button viciousCircleButton = (Button) findViewById(R.id.vicious_circle_button);
        Button angleCircleButton = (Button) findViewById(R.id.angle_circle_button);

        linkToActivity(viciousCircleButton, ViciousCircle.class);
        linkToActivity(angleCircleButton, AngelCircle.class);

    }

    public void linkToActivity(Button button, Class c) {
        final Class aClass = c;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viciousCircleIntent = new Intent(CircleOverview.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }
}
