package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button d=findViewById(R.id.DashBoard);
        Button r=findViewById(R.id.repo);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(send);

            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AmeenaAbdullah/MobileComputing/tree/main/KidsLearningApp"));
                startActivity(browserIntent);

            }
        });
        Button r_img=findViewById(R.id.repoImge);
        r_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity6.this,RepoImg.class);
                startActivity(send);

            }
        });
    }
}