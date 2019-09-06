package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpow, bmod, bdel, bac, badd,bsub,bdiv,bmul,bequal;
    EditText ans;
//    TextView aans;
    //boolean add, sub, mul, div,pow, mod;
    double var1=0, var2, result;
    String temp, operator="";
    boolean flag=false;
    boolean lastBtnOperator=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0= (Button)findViewById(R.id.btn0);
        b1= (Button)findViewById(R.id.btn1);
        b2= (Button)findViewById(R.id.btn2);
        b3= (Button)findViewById(R.id.btn3);
        b4= (Button)findViewById(R.id.btn4);
        b5= (Button)findViewById(R.id.btn5);
        b6= (Button)findViewById(R.id.btn6);
        b7= (Button)findViewById(R.id.btn7);
        b8= (Button)findViewById(R.id.btn8);
        b9= (Button)findViewById(R.id.btn9);

        bpow= (Button)findViewById(R.id.btnpow);
        bmod= (Button)findViewById(R.id.btnmod);
        bdel= (Button)findViewById(R.id.btndel);
        bac= (Button) findViewById(R.id.btnac);

        badd= (Button)findViewById(R.id.btnadd);
        bsub= (Button)findViewById(R.id.btnsub);
        bdiv= (Button)findViewById(R.id.btndiv);
        bmul= (Button)findViewById(R.id.btnmul);
        bdot= (Button)findViewById(R.id.btndot);
        bequal= (Button)findViewById(R.id.btnequal);

        ans= (EditText) findViewById(R.id.Answer);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bdot.setOnClickListener(this);

        bpow.setOnClickListener(this);
        bmod.setOnClickListener(this);
        bdel.setOnClickListener(this);
        bac.setOnClickListener(this);

        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bequal.setOnClickListener(this);

//        aans= (TextView)findViewById(R.id.Result);

//        b0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"0");
//            }
//        });
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"1");
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"2");
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"3");
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"4");
//            }
//        });
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"5");
//            }
//        });
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"6");
//            }
//        });
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"7");
//            }
//        });
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"8");
//            }
//        });
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+"9");
//            }
//        });
//        bdot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(ans.getText()+".");
//            }
//        });
//        badd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                add=true;
//                ans.setText(null);
//            }
//        });
//        bsub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                sub=true;
//                ans.setText(null);
//            }
//        });
//        bmul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                mul=true;
//                ans.setText(null);
//            }
//        });
//        bdiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                div=true;
//                ans.setText(null);
//            }
//        });
//        bpow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                pow=true;
//                ans.setText(null);
//            }
//        });
//        bmod.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var1=Double.parseDouble(ans.getText()+"");
//                mod=true;
//                ans.setText(null);
//            }
//        });
//        bdel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ans.setText(0);
//            }
//        });
//
//        bequal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                var2=Double.parseDouble(ans.getText()+"");
//                if(add==true)
//                {
//                    ans.setText(var1+var2+"");
//                    add=false;
//                }
//                if(sub==true)
//                {
//                    ans.setText(var1-var2+"");
//                    sub=false;
//                }
//                if(mul==true)
//                {
//                    ans.setText(var1*var2+"");
//                    mul=false;
//                }
//                if(div==true)
//                {
//                    ans.setText(var1/var2+"");
//                    div=false;
//                }
//                if(pow==true)
//                {
//                    ans.setText(Math.pow(var1,var2)+"");
//                    pow=false;
//                }
//                if(mod==true)
//                {
//                    ans.setText((int) var1 % (int) var2+"");
//
//                    mod=false;
//                }
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn0:
                temp=ans.getText().toString();
                if(!temp.isEmpty())
                {
                ans.setText(temp+"0");}
                break;
            case R.id.btn1:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"1");
                flag=false;
                break;
            case R.id.btn2:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"2");
                flag=false;
                break;
            case R.id.btn3:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"3");
                flag=false;
                break;
            case R.id.btn4:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"4");
                flag=false;
                break;
            case R.id.btn5:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"5");
                flag=false;
                break;
            case R.id.btn6:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"6");
                flag=false;
                break;
            case R.id.btn7:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"7");
                flag=false;
                break;
            case R.id.btn8:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"8");
                flag=false;
                break;
            case R.id.btn9:
                if(flag){
                    ans.setText("");
                }
                temp=ans.getText().toString();
                ans.setText(temp+"9");
                flag=false;
                break;
            case R.id.btndot:

                temp=ans.getText().toString();
                ans.setText(temp+".");
                break;


            case R.id.btnadd:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Add";
                ans.setText("");
                break;
            case R.id.btnsub:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Sub";
                ans.setText("");
                break;
            case R.id.btnmul:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Mul";
                ans.setText("");
                break;
            case R.id.btndiv:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Div";
                ans.setText("");
                break;
            case R.id.btnpow:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Pow";
                ans.setText("");
                break;
            case R.id.btnmod:
                temp=ans.getText().toString();
                var1=Double.parseDouble(temp);
                operator="Mod";
                ans.setText("");
                break;

            case R.id.btnac:
                temp="";
                ans.setText("");
                break;

            case R.id.btnequal:
                if(operator=="Add")
                {

                    var2=Double.parseDouble(ans.getText().toString());
                    result=var1+var2;
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else if(operator=="Sub")
                {
                    var2=Double.parseDouble(ans.getText().toString());
                    result=var1-var2;
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else if(operator=="Mul")
                {
                    var2=Double.parseDouble(ans.getText().toString());
                    result=var1*var2;
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else if(operator=="Div")
                {
                    var2=Double.parseDouble(ans.getText().toString());
                    result=var1/var2;
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else if(operator=="Pow")
                {
                    var2=Double.parseDouble(ans.getText().toString());
                    result=Math.pow(var1,var2);
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else if(operator=="Mod")
                {
                    var2=Double.parseDouble(ans.getText().toString());
                    result=(int)var1%(int)var2;
                    ans.setText("");
                    ans.setText(String.valueOf(result));
                }
                else
                {

                    ans.setText("");
                }

                break;

        }

    }
}
