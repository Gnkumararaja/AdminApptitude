package com.admin.apptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class DeleteCategory extends AppCompatActivity {
    Spinner sp, sp1;
    Button delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_category);
        getSupportActionBar().setTitle("Delete Category");
        init();

        List<String> category=new ArrayList<String>();
        category.add("Easy");
        category.add("Intermediate");
        category.add("Hard");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,category);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);


        List<String> candidate=new ArrayList<String>();
        candidate.add("Numeric");
        candidate.add("Reasoning");
        candidate.add("Logic");

        ArrayAdapter<String> dataaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,candidate);
        dataaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataaAdapter);
    }

    private void init() {
        sp=findViewById(R.id.select_d_type);
        sp1=findViewById(R.id.select_d_category);
        delete=findViewById(R.id.delete_category);
    }
}
