package com.jeevraj;

public class Arith {



    public int add(int a, int b) {
        int x = a + b;
        return x;

    }

    public String add(String a, String b) {
        String x = a + b;
        return x; //this will just concatenate strings. From this we can learn function overloading
        // where same function name is performing different tasks and also
        // operator overloading performing addition and concatenation

    }

    public int sub(int a, int b) {
        int x = a - b;
        return x;

    }

    public int diff(int a, int b) {
        int x;
        if (a>b){
            x = a - b;}
        else x = b - a;
        return x;

    }

    public int mul(int a, int b) {
        int x = a * b;
        return x;

    }

    public float div(int a, int b) {
        float x = (a / (float)b);
        return x; //arithmetic operation on integers returns only integer, hence
        // it was necessary to typecase atleast one integer to float. so here we can see (float)b
        //to format output, like only 2 digits after decimal, we can create System.out.printf function
        //in Main java function from where this class.method will be called

    }
}
