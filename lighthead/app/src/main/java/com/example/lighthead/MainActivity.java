package com.example.lighthead;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout bgelement = (RelativeLayout)findViewById(R.id.RelativeLayout);
        bgelement.setBackgroundColor(Color.RED);
        Buttonlisterner();
    }

    public void Buttonlisterner()
    {
        change= (Button)findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout bgelement =(RelativeLayout)findViewById(R.id.RelativeLayout);
                int color= ((ColorDrawable)bgelement.getBackground()).getColor();
                if(color== Color.RED)
                    bgelement.setBackgroundColor(Color.BLUE);
                else
                    bgelement.setBackgroundColor(Color.RED);
            }
        });
    }
}
