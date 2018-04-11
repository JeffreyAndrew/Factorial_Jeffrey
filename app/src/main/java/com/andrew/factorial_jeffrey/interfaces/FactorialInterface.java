package com.andrew.factorial_jeffrey.interfaces;

/**
 * Created by alum.fial1 on 11/04/2018.
 */

public interface FactorialInterface {

    interface View{
        void mostratResultado(String res);
    }

    interface Presenter{
        void mostrarResultado(String res);
        void factorial(String x);
    }
    interface Model{
        void Factorial(String x);
    }
}
