package com.example.mycalcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,add,b4,b5,b6,sub,b8,b9,b10,mul,dot,b13,equal,div,clear,backspace;
    TextView tv;

    Float num1,num2,ans;
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        add=findViewById(R.id.bAdd);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        sub=findViewById(R.id.bSub);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        mul=findViewById(R.id.bMul);
        dot=findViewById(R.id.bDot);
        b13=findViewById(R.id.b13);
        equal=findViewById(R.id.bEqual);
        div=findViewById(R.id.buttonDivide);
        clear=findViewById(R.id.btnclr);
        backspace=findViewById(R.id.btnbackspc);

        tv=findViewById(R.id.textView);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"1");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"2");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"6");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"7");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"8");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"9");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(tv.getText()+"");
                op="+";
                tv.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(tv.getText()+"");
                op="-";
                tv.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(tv.getText()+"");
                op="*";
                tv.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(tv.getText()+"");
                op="/";
                tv.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Float.parseFloat(tv.getText()+"");
                switch (op){
                    case "+" : ans=num1+num2;
                                break;
                    case "-" : ans=num1-num2;
                                break;
                    case "*" : ans=num1*num2;
                                break;
                    case "/" : ans=num1/num2;
                                break;
                }
                tv.setText(ans+"");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(null);
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv.getText().toString().equals("")){
                    String val = tv.getText().toString();

                    if (val.length()>0){
                        val = val.substring(0,val.length()-1);
                        tv.setText(val);
                    }
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+".");
            }
        });

    }
}
