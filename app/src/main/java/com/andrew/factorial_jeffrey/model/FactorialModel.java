package com.andrew.factorial_jeffrey.model;

import android.util.Log;

import com.andrew.factorial_jeffrey.interfaces.FactorialInterface;
import com.andrew.factorial_jeffrey.presentator.FactorialPresentator;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class FactorialModel implements FactorialInterface.Model{

    private FactorialInterface.Presenter presenter;
    private double resultado;

    public FactorialModel(FactorialPresentator factorialPresentator) {
        this.presenter = presenter;
    }

    @Override
    public void Factorial(String x) {

        /*int xx = Integer.parseInt(x);
        while ( xx!=0) {
            resultado=resultado*xx;
            xx--;
        }

        presenter.mostrarResultado(String.valueOf(resultado));*/
        presenter.mostrarResultado("dsadsad");

    }
}
