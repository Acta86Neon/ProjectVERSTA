package com.example.projectversta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_actor);

        Button homepageButton = (Button) findViewById(R.id.homepage_versta_button);
        Button homeButton = (Button) findViewById(R.id.home_button);

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
                Intent viciousCircleIntent = new Intent(AboutActor.this, aClass);
                startActivity(viciousCircleIntent);
            }
        });
    }

}
