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

public class SelectAddcategory extends AppCompatActivity {
    Button add;
    Spinner sp,sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_addcategory);
        getSupportActionBar().setTitle("Select Category");
        init();

        List<String> category=new ArrayList<String>();
        category.add("Easy");
        category.add("Intermediate");
        category.add("Hard");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,category);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);


        List<String> candidate=new ArrayList<String>();
        candidate.add("Raj ");
        candidate.add("Karthick");
        candidate.add("Ragu");

        ArrayAdapter<String> dataaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,candidate);
        dataaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataaAdapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent i = new Intent(SelectAddcategory.this, DeleteCategory.class);
                startActivity(i);*/
            }
        });
    }

    private void init() {
        add=findViewById(R.id.add_category);
        sp=findViewById(R.id.select_a_type);
        sp1=findViewById(R.id.select_a_category);

    }
}
