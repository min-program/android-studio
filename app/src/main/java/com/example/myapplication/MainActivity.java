package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout mLayout = new LinearLayout(this);
        mLayout.setOrientation(LinearLayout.VERTICAL);

        TextView t1 = new TextView(this);
        t1.setTextSize(30);
        t1.setText("코드만으로 화면구성");
        mLayout.addView(t1);

        ImageView img1= new ImageView(this);
        img1.setImageResource(R.drawable.sophia);
        mLayout.addView(img1);
        setContentView(mLayout);

        ImageView img2 = new ImageView(this);
        img2.setImageResource(R.drawable.james);
        img2.setImageAlpha(100 );



        mLayout.addView(img2);
        setContentView(mLayout);
    }
}