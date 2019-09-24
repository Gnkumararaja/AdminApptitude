package com.admin.apptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class DashboardActivity extends AppCompatActivity {
    CardView cd,cd1,cd2,cd3,cd4,cd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_dashboard);
        init();
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardone","Clicked");
                Intent i =new Intent(DashboardActivity.this, CandidateList.class);
                startActivity(i);
            }
        });

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardtwo","Clicked");
                Intent i = new Intent(DashboardActivity.this, Report.class);
                startActivity(i);
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardthree","Clicked");
                Intent i =new Intent(DashboardActivity.this,QuestionList.class);
                startActivity(i);
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardfour","Clicked");
                Intent i =new Intent(DashboardActivity.this,SelectAddQuestions.class);
                startActivity(i);
            }
        });
        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardfive","Clicked");
                Intent i =new Intent(DashboardActivity.this,SelectAddcategory.class);
                startActivity(i);
            }
        });
        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Cardsix","Clicked");
                Intent i =new Intent(DashboardActivity.this,DeleteCategory.class);
                startActivity(i);
            }
        });
    }

    private void init() {
        cd=findViewById(R.id.card1);
        cd1=findViewById(R.id.card2);
        cd2=findViewById(R.id.card3);
        cd3=findViewById(R.id.card4);
        cd4=findViewById(R.id.card5);
        cd5=findViewById(R.id.card6);
    }
}
