package com.example.kidslearningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exam4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam4);
    }

    public void clickoptb(View view) {
        switch(view.getId()){
            case R.id.c4:{
                Incorrectb();
                break;
            }
            case R.id.bb4:{
                Correctb();
                break;
            }
            case R.id.z4:{
                Incorrectb();
                break;
            }
            case R.id.k4:{
                Incorrectb();
                break;
            }



        }
    }
    public void Incorrectb(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Exam4.this);
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
    public void Correctb(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Exam4.this);
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
                        Intent send = new Intent(Exam4.this, MainActivity4.class);
                        startActivity(send);
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}