package com.example.android.abndsinglepageapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Call button */
    public void placeCall (View view) {
        dialPhoneNumber("4192140574");
    }

    /** Called when the user taps the Website button */
    public void visitWebsite (View view) {
        goToUrl("http://kengotoledo.com/");
    }

    /** Launches a webpage using the URL passed into the method */
    public void goToUrl(String url){
        Uri webAddress = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, webAddress);
        startActivity(launchBrowser);
    }

    /** Launches the phone dialer to call the number passed into the method */
    public void dialPhoneNumber (String phoneNumber){
        Intent launchDialer = new Intent(Intent.ACTION_DIAL);
        launchDialer.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(launchDialer);

    }
}
