package com.example.varsha.postmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.android.volley.toolbox.JsonRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    EditText mUrl;
    String mUrlText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUrl = (EditText) findViewById(R.id.urlText);

        mUrlText = mUrl.getText().toString();
    }
}
