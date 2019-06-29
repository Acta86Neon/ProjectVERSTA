package com.example.projectversta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foreword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreword);

        Button groundingButton = (Button) findViewById(R.id.grounding_button);
        Button homeButton = (Button) findViewById(R.id.home_button);

        linkToActivity(groundingButton, Grounding.class);
        linkToActivity(homeButton, MainActivity.class);
    }
    public void linkToActivity(Button button, Class c) {
        final Class aClass = c;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viciousCircleIntent = new Intent(Foreword.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }

}
