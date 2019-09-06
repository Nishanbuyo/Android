package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText uname, pwd;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=(Button) findViewById(R.id.btnSubmit);
        uname=(EditText)findViewById(R.id.userName);
        pwd=(EditText)findViewById(R.id.userPassword);
        name=(TextView)findViewById(R.id.tvName);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dummyName=uname.getText().toString();
                String dummypwd=pwd.getText().toString();
                Toast.makeText(MainActivity.this, "Hello Short Press"+"Username= "+dummyName+ "Password= "+ dummypwd, Toast.LENGTH_SHORT).show();
                if(!dummyName.isEmpty()) {
                    name.setText("Hello " + dummyName);
                    name.setVisibility(View.VISIBLE);
                }
                if(dummypwd.isEmpty())
                {
                    name.setText("Enter the Password");
                    name.setVisibility(View.VISIBLE);
                }
            }
        });
        submit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Long Press", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
