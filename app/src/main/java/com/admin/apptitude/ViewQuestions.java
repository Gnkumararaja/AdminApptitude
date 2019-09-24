package com.admin.apptitude;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class ViewQuestions extends AppCompatActivity {
    FloatingActionButton fab;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_view_questions);

        init();
        recylerViewLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter=new CandidateAdapter(model(),context);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void init() {
        recyclerView=findViewById(R.id.recycle_questionlist);
    }

    private List<Model> model(){
        List<Model> data = new ArrayList<>();

        data.add(new Model("Kumar","001","8526666","kkdkd","dwkdw"));
        /*data.add(new NumericModelData.Taketest("INTERMEDIATE"));
        data.add(new NumericModelData.Taketest("HARD"));*/

        return data;
    }
}
