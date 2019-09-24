package com.admin.apptitude;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CandidateList extends AppCompatActivity {
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
        setContentView(R.layout.activity_candidate_list);



        init();
        recylerViewLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter=new CandidateAdapter(model(),context);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li=LayoutInflater.from(CandidateList.this);
                View candidate=li.inflate(R.layout.candidate,null);
                Log.v("Clicked","Working");
                /*Intent i =new Intent(CandidateList.this,AddCandidate.class);
                startActivity(i);*/
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(CandidateList.this);
                alertDialog.setView(candidate);

                final TextInputEditText name,id,mobile,email,password;
                name=(TextInputEditText)candidate.findViewById(R.id.c_name);
                id=(TextInputEditText)candidate.findViewById(R.id.c_id);
                mobile=(TextInputEditText)candidate.findViewById(R.id.c_mobile);
                email=(TextInputEditText)candidate.findViewById(R.id.c_email);
                password=(TextInputEditText)candidate.findViewById(R.id.c_password);

                alertDialog.setCancelable(false)
                        .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(CandidateList.this, "Sucess"+name.getText().toString(), Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog1=alertDialog.create();
                alertDialog1.show();
                alertDialog1.setCanceledOnTouchOutside(true);
            }
        });
    }

    private List<Model> model(){
        List<Model> data = new ArrayList<>();

        data.add(new Model("Kumar","001","8526666","kkdkd","dwkdw"));
        /*data.add(new NumericModelData.Taketest("INTERMEDIATE"));
        data.add(new NumericModelData.Taketest("HARD"));*/

        return data;
    }

    private void init() {
        fab=findViewById(R.id.fab);
        recyclerView=findViewById(R.id.recycle_category);
    }
}
