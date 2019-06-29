package com.example.projectversta;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.annotation.AnyRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView aboutActorButton = (TextView) findViewById(R.id.about_actor_button);
        Button aboutBookButton = (Button) findViewById(R.id.about_book_button);
        Button circleOverviewButton = (Button) findViewById(R.id.angle_circle_button);
        Button forewordButton = (Button) findViewById(R.id.foreword_button);
        Button groundingButton = (Button) findViewById(R.id.grounding_button);

        linkToActivity(aboutBookButton, AboutBook.class);
        linkToActivity(circleOverviewButton, CircleOverview.class);
        linkToActivity(forewordButton, Foreword.class);
        linkToActivity(groundingButton, Grounding.class);

        aboutActorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutActorIntent = new Intent(MainActivity.this, AboutActor.class);
                startActivity(aboutActorIntent);
            }
        });
    }
    public void linkToActivity(Button button, Class c) {
        final Class aClass = c;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viciousCircleIntent = new Intent(MainActivity.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }


}
