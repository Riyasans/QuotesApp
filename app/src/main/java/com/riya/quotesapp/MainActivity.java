package com.riya.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button share;
    TextView quote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share = findViewById(R.id.btnshare);
        quote = findViewById(R.id.textView3);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sharetext = quote.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT , sharetext);
                startActivity(sendIntent);
            }
        });
    }
}