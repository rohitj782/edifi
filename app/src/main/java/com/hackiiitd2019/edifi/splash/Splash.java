package com.hackiiitd2019.edifi.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hackiiitd2019.edifi.MainActivity;
import com.hackiiitd2019.edifi.R;
import com.hackiiitd2019.edifi.studentorfaculty.StudentOrFaculty;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, StudentOrFaculty.class));
                finish();
            }
        },1500);

    }
}
