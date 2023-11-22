package com.example.appmatrix;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.util.Log;  
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public EditText cell111;
    public EditText cell121;
    public EditText cell131;
    public EditText cell112;
    public EditText cell122;
    public EditText cell132;
    public EditText cell113;
    public EditText cell123;
    public EditText cell133;

    public EditText cell211;
    public EditText cell221;
    public EditText cell231;
    public EditText cell212;
    public EditText cell222;
    public EditText cell232;
    public EditText cell213;
    public EditText cell223;
    public EditText cell233;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcDET(View v)
    {
        Button button = (Button) v;

        cell111 = findViewById(R.id.cell111);
        cell121 = findViewById(R.id.cell121);
        cell131 = findViewById(R.id.cell131);
        cell112 = findViewById(R.id.cell112);
        cell122 = findViewById(R.id.cell122);
        cell132 = findViewById(R.id.cell132);
        cell113 = findViewById(R.id.cell113);
        cell123 = findViewById(R.id.cell123);
        cell133 = findViewById(R.id.cell133);

        double d111 = Double.parseDouble(cell111.getText().toString());
        double d121 = Double.parseDouble(cell121.getText().toString());
        double d131 = Double.parseDouble(cell131.getText().toString());
        double d112 = Double.parseDouble(cell112.getText().toString());
        double d122 = Double.parseDouble(cell122.getText().toString());
        double d132 = Double.parseDouble(cell132.getText().toString());
        double d113 = Double.parseDouble(cell113.getText().toString());
        double d123 = Double.parseDouble(cell123.getText().toString());
        double d133 = Double.parseDouble(cell133.getText().toString());

        double det = findDET(d111, d121, d131, d112, d122, d132, d113, d123, d133);
        CharSequence answer = Double.toString(det);
        button.setText(answer);

    }

    public double findDET(double d111,    double d121,    double d131,    double d112,    double d122,    double d132,    double d113,    double d123,    double d133)
    {
        return d111 * d122 * d133 + d112 * d123 * d131 + d113 * d121 * d132 - d113 * d122 * d131 - d112 * d121 * d133 - d111 * d123 * d132;
    }

    public void reversedMatrix(View v){

        Button button = (Button) v;

        cell111 = findViewById(R.id.cell111);
        cell121 = findViewById(R.id.cell121);
        cell131 = findViewById(R.id.cell131);
        cell112 = findViewById(R.id.cell112);
        cell122 = findViewById(R.id.cell122);
        cell132 = findViewById(R.id.cell132);
        cell113 = findViewById(R.id.cell113);
        cell123 = findViewById(R.id.cell123);
        cell133 = findViewById(R.id.cell133);



        double d111 = Double.parseDouble(cell111.getText().toString());
        double d121 = Double.parseDouble(cell121.getText().toString());
        double d131 = Double.parseDouble(cell131.getText().toString());
        double d112 = Double.parseDouble(cell112.getText().toString());
        double d122 = Double.parseDouble(cell122.getText().toString());
        double d132 = Double.parseDouble(cell132.getText().toString());
        double d113 = Double.parseDouble(cell113.getText().toString());
        double d123 = Double.parseDouble(cell123.getText().toString());
        double d133 = Double.parseDouble(cell133.getText().toString());

        double det = findDET(d111, d121, d131, d112, d122, d132, d113, d123, d133);

        //найти миноры

        double a11 = d122*d133 - d123*d132;
        double a21 = -(d112*d133 - d113*d132);
        double a31 = d112*d123 - d113*d122;
        double a12 = -(d121*d133 - d123*d131);
        double a22 = d111*d133 - d113*d131;
        double a32 = -(d111*d123 - d113*d121);
        double a13 = d121*d132 - d122*d131;
        double a23 = -(d111*d132 - d112*d131);
        double a33 = d111*d122 - d112*d121;

        //транспонирование

        double tr11 = a11;
        double tr12 = a21;
        double tr13 = a31;
        double tr21 = a12;
        double tr22 = a22;
        double tr23 = a32;
        double tr31 = a13;
        double tr32 = a23;
        double tr33 = a33;

        //поделить транспонированную матрицу миноров на определитель

        double A_11 = tr11 / det;
        double A_21 = tr21 / det;
        double A_31 = tr31 / det;
        double A_12 = tr12 / det;
        double A_22 = tr22 / det;
        double A_32 = tr32 / det;
        double A_13 = tr13 / det;
        double A_23 = tr23 / det;
        double A_33 = tr33 / det;

        //вывести результат вычислений на GUI

        cell111.setText(Double.toString(A_11));
        cell121.setText(Double.toString(A_21));
        cell131.setText(Double.toString(A_31));
        cell112.setText(Double.toString(A_12));
        cell122.setText(Double.toString(A_22));
        cell132.setText(Double.toString(A_32));
        cell113.setText(Double.toString(A_13));
        cell123.setText(Double.toString(A_23));
        cell133.setText(Double.toString(A_33));
    }

    public void multiplyMatrixes(View v){
        Button button = (Button) v;

        cell111 = findViewById(R.id.cell111);
        cell121 = findViewById(R.id.cell121);
        cell131 = findViewById(R.id.cell131);
        cell112 = findViewById(R.id.cell112);
        cell122 = findViewById(R.id.cell122);
        cell132 = findViewById(R.id.cell132);
        cell113 = findViewById(R.id.cell113);
        cell123 = findViewById(R.id.cell123);
        cell133 = findViewById(R.id.cell133);

        cell211 = findViewById(R.id.cell211);
        cell221 = findViewById(R.id.cell221);
        cell231 = findViewById(R.id.cell231);
        cell212 = findViewById(R.id.cell212);
        cell222 = findViewById(R.id.cell222);
        cell232 = findViewById(R.id.cell232);
        cell213 = findViewById(R.id.cell213);
        cell223 = findViewById(R.id.cell223);
        cell233 = findViewById(R.id.cell233);


        double n111 = Double.parseDouble(cell111.getText().toString());
        double n121 = Double.parseDouble(cell121.getText().toString());
        double n131 = Double.parseDouble(cell131.getText().toString());
        double n112 = Double.parseDouble(cell112.getText().toString());
        double n122 = Double.parseDouble(cell122.getText().toString());
        double n132 = Double.parseDouble(cell132.getText().toString());
        double n113 = Double.parseDouble(cell113.getText().toString());
        double n123 = Double.parseDouble(cell123.getText().toString());
        double n133 = Double.parseDouble(cell133.getText().toString());


        double n211 = Double.parseDouble(cell211.getText().toString());
        double n221 = Double.parseDouble(cell221.getText().toString());
        double n231 = Double.parseDouble(cell231.getText().toString());
        double n212 = Double.parseDouble(cell212.getText().toString());
        double n222 = Double.parseDouble(cell222.getText().toString());
        double n232 = Double.parseDouble(cell232.getText().toString());
        double n213 = Double.parseDouble(cell213.getText().toString());
        double n223 = Double.parseDouble(cell223.getText().toString());
        double n233 = Double.parseDouble(cell233.getText().toString());

        double m11 = n111*n211 + n112*n221 + n113*n231;
        double m21 = n121*n211 + n122*n221 + n123*n231;
        double m31 = n131*n211 + n132*n221 + n133*n231;
        double m12 = n111*n212 + n112*n222 + n113*n232;
        double m22 = n121*n212 + n122*n222 + n123*n232;
        double m32 = n131*n212 + n132*n222 + n133*n232;
        double m13 = n111*n213 + n112*n223 + n113*n233;
        double m23 = n121*n213 + n122*n223 + n123*n233;
        double m33 = n131*n213 + n132*n223 + n133*n233;


        cell111.setText(Double.toString(m11));
        cell121.setText(Double.toString(m21));
        cell131.setText(Double.toString(m31));
        cell112.setText(Double.toString(m12));
        cell122.setText(Double.toString(m22));
        cell132.setText(Double.toString(m32));
        cell113.setText(Double.toString(m13));
        cell123.setText(Double.toString(m23));
        cell133.setText(Double.toString(m33));
    }
}