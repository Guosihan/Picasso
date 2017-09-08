package com.example.gsh.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView img_picasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url ="www.baidu.com";
        setContentView(R.layout.activity_main);
        img_picasso = (ImageView) findViewById(R.id.picasso);
        Picasso.with(MainActivity.this).load(R.drawable.yyy001).into(img_picasso);
    }
}
