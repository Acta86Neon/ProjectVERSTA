package com.example.projectversta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Grounding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grounding);

        Button homepageButton = (Button) findViewById(R.id.homepage_versta_button);
        Button homeButton = (Button) findViewById(R.id.home_button);


        final TextView action_1 = (TextView) findViewById(R.id.action_1);
        final TextView view_1 = (TextView) findViewById(R.id.view_1);
        final TextView action_2 = (TextView) findViewById(R.id.action_2);
        final TextView view_2 = (TextView) findViewById(R.id.view_2);
        final TextView action_3 = (TextView) findViewById(R.id.action_3);
        final TextView view_3 = (TextView) findViewById(R.id.view_3);
        final TextView action_4 = (TextView) findViewById(R.id.action_4);
        final TextView view_4 = (TextView) findViewById(R.id.view_4);
        final TextView action_5 = (TextView) findViewById(R.id.action_5);
        final TextView view_5 = (TextView) findViewById(R.id.view_5);
        final TextView action_6 = (TextView) findViewById(R.id.action_6);
        final TextView view_6 = (TextView) findViewById(R.id.view_6);

        visibleHideTextview(action_1, view_1);
        visibleHideTextview(action_2, view_2);
        visibleHideTextview(action_3, view_3);
        visibleHideTextview(action_4, view_4);
        visibleHideTextview(action_5, view_5);
        visibleHideTextview(action_6, view_6);

        openHomepage(homepageButton);
        linkToActivity(homeButton, MainActivity.class);

    }
    public void openHomepage(Button i) {
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepageLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.versta.ch"));
                startActivity(homepageLink);
            }
        });
    }
    public void linkToActivity(Button button, Class c) {
        final Class aClass = c;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viciousCircleIntent = new Intent(Grounding.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }
    public void visibleHideTextview(TextView O, TextView X) {
        final TextView P = X;
        O.setOnClickListener(new View.OnClickListener() {
            boolean z = true;
            @Override
            public void onClick(View v) {
                if (z == true) {
                    P.setVisibility(View.VISIBLE);
                    z = false;
                } else {
                    P.setVisibility(View.GONE);
                    z = true;
                }
            }
        });
    }

}
