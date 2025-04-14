package com.hanzalah.oopsall;

public class Circle extends Shapes {
    public int radius;
    final static double PI=3.142;
    /*public void PrintareaOfRadius(){
        System.out.println("area of radius is "+ 2*PI*radius);
    }*/
    public Circle(int r){
        this.radius=r;
        System.out.println("im calling constructor of circle");
    }

    @Override
    public void area()

        {
            System.out.println("override" +"area of radius is " + 2*PI*radius);

        }

}
