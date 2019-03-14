package com.example.myserver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText Username,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void login(View view)
    {
        Username=(EditText)findViewById(R.id.UserName);
        Password=(EditText)findViewById(R.id.editText);
        if(Username.getText().toString()=="admin" && Password.getText().toString()=="admin"){
            Intent intent=new Intent(this, success.class);
            startActivity(intent);

        }
    }

    public void faq(View view)
    {
        Intent intent=new Intent(this, faq.class);
        startActivity(intent);

    }
    //.getText().toString()
}
