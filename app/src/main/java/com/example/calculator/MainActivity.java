package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    TextView tv;EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       add =findViewById(R.id.b1);
       sub=findViewById(R.id.b2);
       mul=findViewById(R.id.b3);
       div=findViewById(R.id.b4);
       tv=findViewById(R.id.tv);
       ed1=findViewById(R.id.ed1);
       ed2=findViewById(R.id.ed2);

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(ed1.getText().toString().equals(" ")){
                   Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
               }
               else if(ed2.getText().toString().equals("")){
                   Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
               }
               else{
                   Float a,b,c;
                   a=Float.parseFloat(ed1.getText().toString());
                   b=Float.parseFloat(ed2.getText().toString());
                   c=a+b;
                   tv.setText("Result"+c);

               }
           }
       });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   if(ed1.getText().toString().equals("")){
                       Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();
                   }
                   else if(ed2.getText().toString().equals("")){
                       Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();

                   }
                   else{
                       Float a,b,c;
                       a=Float.parseFloat(ed1.getText().toString());
                       b=Float.parseFloat(ed2.getText().toString());
                       c=a-b;
                           tv.setText("Result:"+c);

                   }
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ed1.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();
                    }
                    else if(ed2.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Float a,b,c;
                        a=Float.parseFloat(ed1.getText().toString());
                        b=Float.parseFloat(ed2.getText().toString());
                        c=a*b;
                        tv.setText("Result :"+c);

                    }
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ed1.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();
                    }
                    else if(ed2.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        try {
                            Float a, b, c;
                            a = Float.parseFloat(ed1.getText().toString());
                            b = Float.parseFloat(ed2.getText().toString());
                            c = a / b;
                            tv.setText("Result :" + c);
                        }catch(ArithmeticException e){
                            tv.setText("Result : Infinite");
                        }

                    }
                }
            });




    }
}