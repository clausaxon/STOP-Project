package com.example.threadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view){
        ExampleRunnable runnable = new ExampleRunnable(10);
        new Thread(runnable).start();
    }

    public void stopThread(View view){
    ExampleRunnable
    }

    class ExampleThread extends Thread {
        int seconds;

        ExampleThread(int seconds){
            this.seconds = seconds;
        }
        @Override
        public void run() {
            for (int i = 0; i < seconds; i++){
                Log.d(TAG, "startThread: " + i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ExampleRunnable implements Runnable{
        int seconds;

        ExampleRunnable(int seconds){
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for (int i = 0; i < seconds; i++){
                Log.d(TAG, "startThread: " + i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
