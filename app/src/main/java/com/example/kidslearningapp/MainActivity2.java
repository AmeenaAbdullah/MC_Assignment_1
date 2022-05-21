package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button a=findViewById(R.id.a);
    }

    public void clicked(View v) {
        Intent send = new Intent(MainActivity2.this, MainActivity3.class);
        switch(v.getId())
        {
            case R.id.a:{
              send.putExtra("alphabet","a");
                startActivity(send);
                break;
            }
            case R.id.b:{
                send.putExtra("alphabet","b");
                startActivity(send);
                break;
            }
            case R.id.c:{
                send.putExtra("alphabet","c");
                startActivity(send);
                break;
            }
            case R.id.d:{
                send.putExtra("alphabet","d");
                startActivity(send);
                break;
            }
            case R.id.e:{
                send.putExtra("alphabet","e");
                startActivity(send);
                break;
            }
            case R.id.f:{
                send.putExtra("alphabet","f");
                startActivity(send);
                break;
            }
            case R.id.g:{
                send.putExtra("alphabet","g");
                startActivity(send);
                break;
            }
            case R.id.h:{
                send.putExtra("alphabet","h");
                startActivity(send);
                break;
            }
            case R.id.i:{
                send.putExtra("alphabet","i");
                startActivity(send);
                break;
            }
            case R.id.j:{
                send.putExtra("alphabet","j");
                startActivity(send);
                break;
            }
            case R.id.k:{
                send.putExtra("alphabet","k");
                startActivity(send);
                break;
            }
            case R.id.l:{
                send.putExtra("alphabet","l");
                startActivity(send);
                break;
            }
            case R.id.m:{
                send.putExtra("alphabet","m");
                startActivity(send);
                break;
            }
            case R.id.n:{
                send.putExtra("alphabet","n");
                startActivity(send);
                break;
            }
            case R.id.o:{
                send.putExtra("alphabet","o");
                startActivity(send);
                break;
            }
            case R.id.p:{
                send.putExtra("alphabet","p");
                startActivity(send);
                break;
            }case R.id.q:{
            send.putExtra("alphabet","q");
            startActivity(send);
            break;
        }
            case R.id.r:{
                send.putExtra("alphabet","r");
                startActivity(send);
                break;
            }
            case R.id.s:{
                send.putExtra("alphabet","s");
                startActivity(send);
                break;
            }
            case R.id.t:{
                send.putExtra("alphabet","t");
                startActivity(send);
                break;
            }
            case R.id.u:{
                send.putExtra("alphabet","u");
                startActivity(send);
                break;
            }
            case R.id.v:{
                send.putExtra("alphabet","v");
                startActivity(send);
                break;
            }
            case R.id.w:{
                send.putExtra("alphabet","w");
                startActivity(send);
                break;
            }
            case R.id.x:{
                send.putExtra("alphabet","x");
                startActivity(send);
                break;
            }
            case R.id.y:{
                send.putExtra("alphabet","y");
                startActivity(send);
                break;
            }
            case R.id.z:{
                send.putExtra("alphabet","z");
                startActivity(send);
                break;
            }

        }


        }



}