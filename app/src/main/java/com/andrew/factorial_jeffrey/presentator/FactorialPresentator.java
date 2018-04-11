package com.andrew.factorial_jeffrey.presentator;

import com.andrew.factorial_jeffrey.interfaces.FactorialInterface;
import com.andrew.factorial_jeffrey.model.FactorialModel;
import com.andrew.factorial_jeffrey.view.FactorialView;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public class FactorialPresentator implements FactorialInterface.Presenter {

    private FactorialInterface.View view;
    private FactorialInterface.Model model;

    public FactorialPresentator(FactorialView factorialView) {
        this.view = view;
        model = new FactorialModel(this);
    }

    @Override
    public void mostrarResultado(String res) {
        if(view!=null){
            view.mostratResultado(res);
        }
    }

    @Override
    public void factorial(String x) {

        if(view!=null){
            model.Factorial(x);
        }
    }
}
