package com.example.projectversta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AngelCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel_circle);

        Button aboutActorButton = (Button) findViewById(R.id.about_actor_button);
        Button homeButton = (Button) findViewById(R.id.home_button);

        linkToActivity(aboutActorButton, AboutActor.class);
        linkToActivity(homeButton, MainActivity.class);

    }

    public void linkToActivity(Button button, Class c) {
        final Class aClass = c;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viciousCircleIntent = new Intent(AngelCircle.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }
}
