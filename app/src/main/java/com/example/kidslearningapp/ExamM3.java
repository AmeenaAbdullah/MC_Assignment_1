package com.example.kidslearningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExamM3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_m3);
    }

    public void clickoptz(View view) {
        switch(view.getId()){
            case R.id.o2:{
                Incorrectz();
                break;
            }
            case R.id.z1:{
                Correctz();
                break;
            }
            case R.id.m2:{
                Incorrectz();
                break;
            }
            case R.id.q2:{
                Incorrectz();
                break;
            }



        }
    }
    public void Incorrectz(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ExamM3.this);
        builder.setMessage("Wrong!!! Answer is P\n Enter Correct one");

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
    public void Correctz(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ExamM3.this);
        builder.setMessage(" You got one more point ");

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
                        Intent send = new Intent(ExamM3.this, MainActivity4.class);
                        startActivity(send);
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}