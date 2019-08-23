package com.hackiiitd2019.edifi.studentorfaculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hackiiitd2019.edifi.Admin.Admin;
import com.hackiiitd2019.edifi.R;

public class StudentOrFaculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_or_faculty);

        TextView textView = findViewById(R.id.textViewAdmin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentOrFaculty.this, Admin.class));
            }
        });

    }
}
