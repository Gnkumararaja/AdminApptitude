package com.admin.apptitude;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String a="admin",b="password";
    TextInputLayout username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(i);

            }

        });
    }

    private void init() {
    username=findViewById(R.id.uname);
    password=findViewById(R.id.password);
    login=findViewById(R.id.btn_login);
    }
}
