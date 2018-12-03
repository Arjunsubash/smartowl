package com.example.android.smartowl;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    private Button signout;
    private FirebaseAuth auth;
    private ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth =FirebaseAuth.getInstance();
        signout=(Button)findViewById(R.id.button4);

        image=(ImageView) findViewById(R.id.imageView2);
        String url="https://firebasestorage.googleapis.com/v0/b/smartowl-9f61e.appspot.com/o/photo.jpg?alt=media&token=b8d2c92e-20d4-4082-a6ed-44c22b368e02";
        Glide.with(getApplicationContext()).load(url).into(image);
    }

public void Logout (View view){
        auth.signOut();
    Intent i=new Intent(this,Home.class);
    startActivity(i);
    }

}



