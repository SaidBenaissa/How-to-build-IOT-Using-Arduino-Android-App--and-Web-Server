package com.example.efriem.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bLamp1;
    Button bLamp2;
    Button bLamp3;
    Button bLamp4;
    Button bLamp11;
    Button bLamp22;
    Button bLamp33;
    Button bLamp44;
    Button bMotorForward;
    Button bMotorReverse;
    Button bTurnOnAll;
    Button bTurnOffAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bLamp1 = (Button)findViewById(R.id.bLamp1);
        bLamp2 = (Button)findViewById(R.id.bLamp2);
        bLamp3 = (Button)findViewById(R.id.bLamp3);
        bLamp4 = (Button)findViewById(R.id.bLamp4);
        bLamp11 = (Button)findViewById(R.id.bLamp11);
        bLamp22 = (Button)findViewById(R.id.bLamp22);
        bLamp33 = (Button)findViewById(R.id.bLamp33);
        bLamp44 = (Button)findViewById(R.id.bLamp44);
        bMotorForward = (Button)findViewById(R.id.bMotorForward);
        bMotorReverse = (Button)findViewById(R.id.bMotorReverse);
        bTurnOnAll = (Button)findViewById(R.id.bLampA);
        bTurnOffAll = (Button)findViewById(R.id.bLampAl);
    }
    public void turnOnLamp1(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn On Lamp 1");
    }
    public void turnOffLamp1(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn Off Lamp 1");
    }
    public void turnOnLamp2(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn On Lamp 2");
    }
    public void turnOffLamp2(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn Off Lamp 2");
    }
    public void turnOnLamp3(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn On Lamp 3");
    }
    public void turnOffLamp3(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn Off Lamp 3");
    }
    public void turnOnLamp4(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn On Lamp 4");
    }
    public void turnOffLamp4(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn Off Lamp 4");
    }
    public void turnOnAll(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn On All");
    }
    public void turnOffAll(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Turn Off All");
    }
    public void mForward(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Motor Forward");
    }
    public void mReverse(View view)
    {
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute("Motor Reverse");
    }
}
