package com.example.minipiano;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int a;
    private int b;
    private int csharp;
    private int dsharp;
    private int fsharp;
    private int gsharp;
    private int asharp;
    private SoundPool SP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Work Cited: https://androiddvlpr.com/using-android-soundpool-build-your-own-android-piano-app/
        //creating the sounds
        SP = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        //all the sounds
        c=SP.load(getApplicationContext(),R.raw.c,1);
        d=SP.load(getApplicationContext(),R.raw.d,1);
        e=SP.load(getApplicationContext(),R.raw.e,1);
        f=SP.load(getApplicationContext(),R.raw.f,1);
        g=SP.load(getApplicationContext(),R.raw.g,1);
        a=SP.load(getApplicationContext(),R.raw.a,1);
        b=SP.load(getApplicationContext(),R.raw.b,1);
        csharp=SP.load(getApplicationContext(),R.raw.c_hash,1);
        dsharp=SP.load(getApplicationContext(),R.raw.d_hash,1);
        fsharp=SP.load(getApplicationContext(),R.raw.f_hash,1);
        gsharp=SP.load(getApplicationContext(),R.raw.g_hash,1);
        asharp=SP.load(getApplicationContext(),R.raw.a_hash,1);

    }
    //function for the onclick for the buttons
    public void CSound(View view){
        SP.play(c,1.0f,1.0f,1,0,1.0f);
    }
    public void DSound(View view){
        SP.play(d,1.0f,1.0f,1,0,1.0f);
    }
    public void ESound(View view){
        SP.play(e,1.0f,1.0f,1,0,1.0f);
    }
    public void FSound(View view){
        SP.play(f,1.0f,1.0f,1,0,1.0f);
    }
    public void GSound(View view){
        SP.play(g,1.0f,1.0f,1,0,1.0f);
    }
    public void ASound(View view){
        SP.play(a,1.0f,1.0f,1,0,1.0f);
    }
    public void BSound(View view){
        SP.play(b,1.0f,1.0f,1,0,1.0f);
    }
    public void CSharpSound(View view){
        SP.play(csharp,1.0f,1.0f,1,0,1.0f);
    }
    public void DSharpSound(View view){
        SP.play(dsharp,1.0f,1.0f,1,0,1.0f);
    }
    public void FSharpSound(View view){
        SP.play(fsharp,1.0f,1.0f,1,0,1.0f);
    }
    public void GSharpSound(View view){
        SP.play(gsharp,1.0f,1.0f,1,0,1.0f);
    }
    public void ASharpSound(View view){
        SP.play(asharp,1.0f,1.0f,1,0,1.0f);
    }
}