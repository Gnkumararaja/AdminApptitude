package com.admin.apptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SelectAddQuestions extends AppCompatActivity {
    Button add;
    Spinner sp,sp1,sp2,sp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_add_questions);
        getSupportActionBar().setTitle("Select Questions");
        init();

        List<String> type=new ArrayList<String>();
        type.add("Easy");
        type.add("Intermediate");
        type.add("Hard");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,type);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);


        List<String> category=new ArrayList<String>();
        category.add("Numeric");
        category.add("Reasoning");
        category.add("Logic");

        ArrayAdapter<String> dataaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,category);
        dataaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataaAdapter);

        List<String> subcategory=new ArrayList<String>();
        subcategory.add("Numeric");
        subcategory.add("Reasoning");
        subcategory.add("Logic");

        ArrayAdapter<String> dataAdapterr = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,subcategory);
        dataAdapterr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(dataAdapter);


        List<String> set=new ArrayList<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        ArrayAdapter<String> dataAdaapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,set);
        dataAdaapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(dataaAdapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SelectAddQuestions.this,AddQuestions.class);
                startActivity(i);
            }
        });

    }

    private void init() {
        add=findViewById(R.id.add_select);
        sp=findViewById(R.id.select_q_type);
        sp1=findViewById(R.id.select_q_category);
        sp2=findViewById(R.id.select_q_subcategory);
        sp3=findViewById(R.id.select_q_sets);

    }
}
