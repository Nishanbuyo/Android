package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonListener();
    }


    public void ButtonListener()
    {
        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText heighttext=(EditText)findViewById(R.id.heightinput);
                String heightstr= heighttext.getText().toString();
                double height=Double.parseDouble(heightstr);

                EditText weighttext=(EditText)findViewById(R.id.weightinput);
                String weightstr=weighttext.getText().toString();
                double weight=Double.parseDouble(weightstr);

                double BMI=(weight)/(height*height);
                EditText BMIresult=(EditText)findViewById(R.id.BMIresult);
                BMIresult.setText(Double.toString(BMI));
                String BMI_cat;
                if(BMI<15)
                    BMI_cat="Very severely underweight";
                else if (BMI<16)
                    BMI_cat="Severly underweight";
                else if(BMI<18.5)
                    BMI_cat="Underweight";
                else if(BMI<25)
                    BMI_cat="Normal(healthy weight";
                else if(BMI<30)
                    BMI_cat="Overweight";
                else if(BMI<35)
                    BMI_cat="Obese Class I (Moderately obese)";
                else if(BMI<40)
                    BMI_cat="Obese Class II (Severly obese)";
                else
                    BMI_cat="Obese Class III (Very severly obese)";
                TextView BMIcategory=(TextView)findViewById(R.id.category);
                BMIcategory.setText(BMI_cat);



            }
        });
    }
}
