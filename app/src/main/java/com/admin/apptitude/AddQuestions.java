package com.admin.apptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_questions);
        getSupportActionBar().setTitle("Add Questions");
    }
}
