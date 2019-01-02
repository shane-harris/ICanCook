package com.example.rockb.icancook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninActivity extends AppCompatActivity implements View.OnClickListener {

    Button googleButton, facebookButton, createButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        googleButton = findViewById(R.id.googleButton);
        facebookButton = findViewById(R.id.facebookButton);
        createButton = findViewById(R.id.createButton);

        googleButton.setOnClickListener(this);
        facebookButton.setOnClickListener(this);
        createButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.googleButton){
            //Insert Code to be executed when google button clicked
            //Should pull google info from user to generate account
        }

        if(v.getId() == R.id.facebookButton){
            //Insert Code to be executed when google button clicked
            //Should pull facebook info from user to generate account
        }

        if(v.getId() == R.id.createButton){
            //Insert Code to be executed when google button clicked
            //Should bring user to account creation Activity
        }



    }

    public void onOpenCameraClick(View view) throws Exception {
        Intent openCameraIntent = new Intent(this, CameraActivity.class);

        final int result = 1;

        startActivity(openCameraIntent);
    }
}
