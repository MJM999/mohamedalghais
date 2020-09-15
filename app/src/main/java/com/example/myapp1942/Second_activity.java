package com.example.myapp1942;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {
    TextView textView;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        TextView=findViewById(R.id.textview);
        bundle=getIntent().getExtras();
        String data=bundle.getString("data", "");
        textView.setText(data);
    }
}