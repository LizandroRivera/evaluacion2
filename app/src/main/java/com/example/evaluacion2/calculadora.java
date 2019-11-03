package com.example.evaluacion2;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora extends AppCompatActivity implements View.OnClickListener{

    public static String Ope = "";
    public static Object Rest = null;

    Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9,
    btnAC, btnDel, btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnParIzq, btnParDer, btnPunto;

    TextView txtOpe, txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("RH16-I04-001");
        }

        this.txtOpe = findViewById(R.id.txtOperacion);
        this.txtResultado = findViewById(R.id.txtResultado);
        this.btnNum0 = findViewById(R.id.num0);
        this.btnNum1 = findViewById(R.id.num1);
        this.btnNum2 = findViewById(R.id.num2);
        this.btnNum3 = findViewById(R.id.num3);
        this.btnNum4 = findViewById(R.id.num4);
        this.btnNum5 = findViewById(R.id.num5);
        this.btnNum6 = findViewById(R.id.num6);
        this.btnNum7 = findViewById(R.id.num7);
        this.btnNum8 = findViewById(R.id.num8);
        this.btnNum9 = findViewById(R.id.num9);
        this.btnSuma = findViewById(R.id.suma);
        this.btnResta = findViewById(R.id.resta);
        this.btnMultiplicacion = findViewById(R.id.multiplicacion);
        this.btnDivision = findViewById(R.id.division);
        this.btnAC = findViewById(R.id.ac);
        this.btnDel = findViewById(R.id.del);
        this.btnIgual = findViewById(R.id.igual);

        //Agregando el evento onClick
        btnNum0.setOnClickListener(this);
        btnNum1.setOnClickListener(this);
        btnNum2.setOnClickListener(this);
        btnNum3.setOnClickListener(this);
        btnNum4.setOnClickListener(this);
        btnNum5.setOnClickListener(this);
        btnNum6.setOnClickListener(this);
        btnNum7.setOnClickListener(this);
        btnNum8.setOnClickListener(this);
        btnNum9.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnIgual.setOnClickListener(this);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            this.txtOpe = findViewById(R.id.txtOperacion);
            this.txtResultado = findViewById(R.id.txtResultado);
            this.btnNum0 = findViewById(R.id.num0);
            this.btnNum1 = findViewById(R.id.num1);
            this.btnNum2 = findViewById(R.id.num2);
            this.btnNum3 = findViewById(R.id.num3);
            this.btnNum4 = findViewById(R.id.num4);
            this.btnNum5 = findViewById(R.id.num5);
            this.btnNum6 = findViewById(R.id.num6);
            this.btnNum7 = findViewById(R.id.num7);
            this.btnNum8 = findViewById(R.id.num8);
            this.btnNum9 = findViewById(R.id.num9);
            this.btnSuma = findViewById(R.id.suma);
            this.btnResta = findViewById(R.id.resta);
            this.btnMultiplicacion = findViewById(R.id.multiplicacion);
            this.btnDivision = findViewById(R.id.division);
            this.btnAC = findViewById(R.id.ac);
            this.btnDel = findViewById(R.id.del);
            this.btnIgual = findViewById(R.id.igual);
            this.btnParIzq = findViewById(R.id.parIzquierda);
            this.btnParDer = findViewById(R.id.parDerecha);
            this.btnPunto = findViewById(R.id.punto);

            //Agregando el evento onClick
            btnNum0.setOnClickListener(this);
            btnNum1.setOnClickListener(this);
            btnNum2.setOnClickListener(this);
            btnNum3.setOnClickListener(this);
            btnNum4.setOnClickListener(this);
            btnNum5.setOnClickListener(this);
            btnNum6.setOnClickListener(this);
            btnNum7.setOnClickListener(this);
            btnNum8.setOnClickListener(this);
            btnNum9.setOnClickListener(this);
            btnSuma.setOnClickListener(this);
            btnResta.setOnClickListener(this);
            btnMultiplicacion.setOnClickListener(this);
            btnDivision.setOnClickListener(this);
            btnAC.setOnClickListener(this);
            btnDel.setOnClickListener(this);
            btnIgual.setOnClickListener(this);
            btnParIzq.setOnClickListener(this);
            btnParDer.setOnClickListener(this);
            btnPunto.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.num0:
                Ope = Ope + "0";
                txtOpe.setText(Ope);
                break;
            case R.id.num1:
                Ope = Ope + "1";
                txtOpe.setText(Ope);
                break;
            case R.id.num2:
                Ope = Ope + "2";
                txtOpe.setText(Ope);
                break;
            case R.id.num3:
                Ope = Ope + "3";
                txtOpe.setText(Ope);
                break;
            case R.id.num4:
                Ope = Ope + "4";
                txtOpe.setText(Ope);
                break;
            case R.id.num5:
                Ope = Ope + "5";
                txtOpe.setText(Ope);
                break;
            case R.id.num6:
                Ope = Ope + "6";
                txtOpe.setText(Ope);
                break;
            case R.id.num7:
                Ope = Ope + "7";
                txtOpe.setText(Ope);
                break;
            case R.id.num8:
                Ope = Ope + "8";
                txtOpe.setText(Ope);
                break;
            case R.id.num9:
                Ope = Ope + "9";
                txtOpe.setText(Ope);
                break;
            case R.id.parIzquierda:
            {
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals(".") | Ope.substring(Ope.length() - 1).equals("(")) {

                    }else{
                        Ope = Ope+"(";
                        txtOpe.setText(Ope);
                    }
                }else{
                    Ope = Ope+"(";
                    txtOpe.setText(Ope);
                }
            }
            break;
            case R.id.parDerecha:
            {
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals(".")) {

                    }else{
                        Ope = Ope+")";
                        txtOpe.setText(Ope);
                    }
                }
            }
            break;
            case R.id.punto:
            {
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals(".") |
                            Ope.substring(Ope.length() - 1).equals("+") |
                            Ope.substring(Ope.length() - 1).equals("-") |
                            Ope.substring(Ope.length() - 1).equals("/") |
                            Ope.substring(Ope.length() - 1).equals("*") |
                            Ope.substring(Ope.length() - 1).equals("(") |
                            Ope.substring(Ope.length() - 1).equals(")")) {

                    }else{
                        Ope = Ope+".";
                        txtOpe.setText(Ope);
                    }
                }
            }
            break;
            case R.id.del:
                if(Ope.length() > 0) {
                    Ope = Ope.substring(0, Ope.length() - 1);
                    txtOpe.setText(Ope);
                }else{

                }
                break;
            case R.id.ac:
                Ope = "";
                Rest = null;
                txtOpe.setText(Ope);
                txtResultado.setText("");
                break;
            case R.id.suma: {
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals("+") | Ope.substring(Ope.length() - 1).equals(".")) {

                    } else if (Ope.substring(Ope.length() - 1).equals("*") | Ope.substring(Ope.length() - 1).equals("-") | Ope.substring(Ope.length() - 1).equals("/")) {
                        Ope = Ope.substring(0, Ope.length() - 1);
                        txtOpe.setText(Ope);
                        Ope = Ope + "+";
                        txtOpe.setText(Ope);
                    } else {
                        Ope = Ope + "+";
                        txtOpe.setText(Ope);
                    }
                }
            }
            break;
            case R.id.resta:{
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals("-") | Ope.substring(Ope.length() - 1).equals(".")) {

                    } else if (Ope.substring(Ope.length() - 1).equals("+")) {
                        Ope = Ope.substring(0, Ope.length() - 1);
                        txtOpe.setText(Ope);
                        Ope = Ope + "-";
                        txtOpe.setText(Ope);
                    } else {
                        Ope = Ope + "-";
                        txtOpe.setText(Ope);
                    }
                }else{
                    Ope = Ope+"-";
                    txtOpe.setText(Ope);
                }
            }
            break;
            case R.id.multiplicacion: {
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals("*") | Ope.substring(Ope.length() - 1).equals(".")) {

                    } else if (Ope.substring(Ope.length() - 1).equals("-") |
                            Ope.substring(Ope.length() - 1).equals("+") |
                            Ope.substring(Ope.length() - 1).equals("/")) {

                        Ope = Ope.substring(0, Ope.length() - 1);
                        txtOpe.setText(Ope);
                        Ope = Ope + "*";
                        txtOpe.setText(Ope);
                    } else {
                        Ope = Ope + "*";
                        txtOpe.setText(Ope);
                    }
                }
            }
            break;
            case R.id.division:{
                if (!Ope.isEmpty()) {
                    if (Ope.substring(Ope.length() - 1).equals("/") | Ope.substring(Ope.length() - 1).equals(".")) {

                    } else if (Ope.substring(Ope.length() - 1).equals("-") |
                            Ope.substring(Ope.length() - 1).equals("+") |
                            Ope.substring(Ope.length() - 1).equals("*")){

                        Ope = Ope.substring(0, Ope.length() - 1);
                        txtOpe.setText(Ope);
                        Ope = Ope + "/";
                        txtOpe.setText(Ope);
                    } else {
                        Ope = Ope + "/";
                        txtOpe.setText(Ope);
                    }
                }
            }
            break;
            case R.id.igual: {
                RealizarOperacion();
            }
            break;
        }

    }

    private void RealizarOperacion() {

        if(Ope.length() > 0) {
            if(Ope.substring(Ope.length() - 1).equals("+") | Ope.substring(Ope.length() - 1).equals("-") |
                    Ope.substring(Ope.length() - 1).equals("*") | Ope.substring(Ope.length() - 1).equals("/") |
                    Ope.substring(Ope.length() - 1).equals(".") | Ope.substring(Ope.length() - 1).equals("(")) {

            }else{
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                try {
                    Rest = engine.eval(Ope);
                    txtResultado.setTextColor(Color.parseColor("#616161"));
                    txtResultado.setText(Rest.toString());
                } catch (ScriptException e) {
                    Log.d("Calculadora", " ScriptEngine error: " + e.getMessage());
                    txtResultado.setTextColor(0xfff00000);
                    txtResultado.setText("Expresion No Valida");
                }
            }
        }else{
            txtResultado.setText("");
        }
    }
}
