package com.admin.apptitude;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Report extends AppCompatActivity {
    Spinner sp1, sp2;
    Button b1;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_report);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Report.this, "Api functions", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void init() {
        sp1 = findViewById(R.id.r_select_category);
        sp2 = findViewById(R.id.r_select_candidate);
        b1 = findViewById(R.id.r_submit);
    }
}
