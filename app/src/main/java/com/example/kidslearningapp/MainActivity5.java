package com.example.kidslearningapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }

    public void clickopt(View view) {
        switch(view.getId()){
            case R.id.q1:{
                Incorrecto();
                break;
            }
            case R.id.p1:{
                Correcto();
                break;
            }
            case R.id.r1:{
                Incorrecto();
                break;
            }
            case R.id.y1:{
                Incorrecto();
                break;
            }



        }
    }
    public void Incorrecto(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity5.this);
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
    public void Correcto(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity5.this);
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
                        Intent send = new Intent(MainActivity5.this, MainActivity4.class);
                        startActivity(send);
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}