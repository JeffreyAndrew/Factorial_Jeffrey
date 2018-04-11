package com.andrew.factorial_jeffrey.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.andrew.factorial_jeffrey.R;
import com.andrew.factorial_jeffrey.interfaces.FactorialInterface;
import com.andrew.factorial_jeffrey.presentator.FactorialPresentator;

public class FactorialView extends AppCompatActivity implements FactorialInterface.View{

    private TextView tvr;
    private EditText edt1;
    private Button btnc;
    private FactorialInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvr = (TextView) findViewById(R.id.tvr);
        edt1 =(EditText) findViewById(R.id.txtNumber);

        presenter = new FactorialPresentator(this);

    }

    public void calculate(View view){
        presenter.factorial(edt1.getText().toString());
    }

    @Override
    public void mostratResultado(String res) {
        Toast.makeText(getApplicationContext(), "QUEDA: "+res, Toast.LENGTH_SHORT).show();
        tvr.setText(res);
    }
}
