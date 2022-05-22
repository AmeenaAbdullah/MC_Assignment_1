package com.example.kidslearningapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageview = (ImageView) findViewById(R.id.imageView);
        if(getIntent().getStringExtra("alphabet").equals("a"))
            imageview.setImageResource(R.drawable.a);
        else if(getIntent().getStringExtra("alphabet").equals("b"))
            imageview.setImageResource(R.drawable.b);
        else if(getIntent().getStringExtra("alphabet").equals("c"))
            imageview.setImageResource(R.drawable.c);
        else if(getIntent().getStringExtra("alphabet").equals("d"))
            imageview.setImageResource(R.drawable.d);
        else if(getIntent().getStringExtra("alphabet").equals("e"))
            imageview.setImageResource(R.drawable.e);
        else if(getIntent().getStringExtra("alphabet").equals("f"))
            imageview.setImageResource(R.drawable.f);
        else if(getIntent().getStringExtra("alphabet").equals("g"))
            imageview.setImageResource(R.drawable.g);
        else if(getIntent().getStringExtra("alphabet").equals("h"))
            imageview.setImageResource(R.drawable.h);
        else if(getIntent().getStringExtra("alphabet").equals("i"))
            imageview.setImageResource(R.drawable.i);
        else if(getIntent().getStringExtra("alphabet").equals("j"))
            imageview.setImageResource(R.drawable.j);
        else if(getIntent().getStringExtra("alphabet").equals("k"))
            imageview.setImageResource(R.drawable.k);
        else if(getIntent().getStringExtra("alphabet").equals("l"))
            imageview.setImageResource(R.drawable.l);
        else if(getIntent().getStringExtra("alphabet").equals("m"))
            imageview.setImageResource(R.drawable.m);
        else if(getIntent().getStringExtra("alphabet").equals("n"))
            imageview.setImageResource(R.drawable.n);
        else if(getIntent().getStringExtra("alphabet").equals("o"))
            imageview.setImageResource(R.drawable.o);
        else if(getIntent().getStringExtra("alphabet").equals("p"))
            imageview.setImageResource(R.drawable.p);
        else if(getIntent().getStringExtra("alphabet").equals("q"))
            imageview.setImageResource(R.drawable.q);
        else if(getIntent().getStringExtra("alphabet").equals("r"))
            imageview.setImageResource(R.drawable.r);
        else if(getIntent().getStringExtra("alphabet").equals("s"))
            imageview.setImageResource(R.drawable.s);
        else if(getIntent().getStringExtra("alphabet").equals("t"))
            imageview.setImageResource(R.drawable.t);
        else if(getIntent().getStringExtra("alphabet").equals("u"))
            imageview.setImageResource(R.drawable.u);
        else if(getIntent().getStringExtra("alphabet").equals("v"))
            imageview.setImageResource(R.drawable.v);
        else if(getIntent().getStringExtra("alphabet").equals("w"))
            imageview.setImageResource(R.drawable.w);
        else if(getIntent().getStringExtra("alphabet").equals("x"))
            imageview.setImageResource(R.drawable.x);
        else if(getIntent().getStringExtra("alphabet").equals("y"))
            imageview.setImageResource(R.drawable.y);
        else if(getIntent().getStringExtra("alphabet").equals("z"))
            imageview.setImageResource(R.drawable.z);
    }

}