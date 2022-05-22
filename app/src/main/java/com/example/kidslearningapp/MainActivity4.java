package com.example.kidslearningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void clickoption(View view) {
        switch(view.getId()){
            case R.id.m2:{
                Incorrect();
                break;
            }
            case R.id.z1:{
               Correct();
                break;
            }
            case R.id.q2:{
                Incorrect();
                break;
            }
            case R.id.o2:{
                Incorrect();
                break;
            }



        }
    }
    public void Incorrect(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
        builder.setMessage("Wrong!!! Answer is B\n Enter Correct one");

        builder.setTitle("Incorrect Choice");
        builder.setCancelable(false);

        builder.setNegativeButton(
                "ok",
                new DialogInterface
                        .OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
    public void Correct(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
        builder.setMessage(" You got one point ");

        builder.setTitle("Congrats");
        builder.setCancelable(false);

        builder.setNegativeButton(
                "Next",
                new DialogInterface
                        .OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        Intent send = new Intent(MainActivity4.this, MainActivity5.class);
                        startActivity(send);
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}