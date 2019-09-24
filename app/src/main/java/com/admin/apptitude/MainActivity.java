package com.admin.apptitude;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    String a="admin",b="password";
    TextInputLayout username,password;
    Button login;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        init();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(i);

            }

        });

        /*image.setImageBitmap(new RoundedImage(ProfileActivity.this).transform(bmpp));*/


    }

    private void init() {
    username=findViewById(R.id.uname);
    password=findViewById(R.id.password);
    login=findViewById(R.id.btn_login);
    image=findViewById(R.id.login_image);
    }
}
