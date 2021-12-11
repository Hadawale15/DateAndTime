package com.example.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String date,time;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_id);
        calendar=Calendar.getInstance();
        simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy ");
        date=simpleDateFormat.format(calendar.getTime());

        simpleDateFormat=new SimpleDateFormat("hh:mm:ss");
        time=simpleDateFormat.format(calendar.getTime());
        textView.setText("Date="+date+"\n"+"Time="+time);
    }
}