package com.berir.quadraticequation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_a,et_b,et_c;
    Button b_go;

    TextView tv_result;

    double a,b,c,d,x1,x2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_a =(EditText) findViewById(R.id.et_a);
        et_b =(EditText) findViewById(R.id.et_b);
        et_c =(EditText) findViewById(R.id.et_c);

        b_go =(Button) findViewById(R.id.b_go);

        tv_result =(TextView) findViewById(R.id.tv_result);




    }

    public void b_go(View view) {
        if (!et_a.getText().toString().equals("") && !et_b.getText().toString().equals("") &&
        !et_c.getText().toString().equals("")){

            a = Double.parseDouble(et_a.getText().toString());
            b = Double.parseDouble(et_b.getText().toString());
            c = Double.parseDouble(et_c.getText().toString());

            d = Math.pow(b, 2) - (4 * a * c);
            if (d == 0) {
                x1 = -b / (2 * a);
                tv_result.setText("d = " + d + "\nx = " + x1);
            } else if (d < 0)
            {
                tv_result.setText("NO Roots!");
            } else {
                if (d > 0) {
                    x1 = (-b + Math.sqrt(d) / 2 * a);
                    x2 = (-b - Math.sqrt(d) / 2 * a);
                    tv_result.setText("d = " + d + "\nx1= " + x1 + "\nx2 =" + x2);


                }
            }



        }
    }
}
