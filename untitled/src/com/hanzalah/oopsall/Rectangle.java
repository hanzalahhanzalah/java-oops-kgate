package com.hanzalah.oopsall;

public class Rectangle extends Shapes {


    /*
    //Abstraaction konsi chezen dikhani hen or konsi nai use Access MOdifiers
    //public
    //protected
    //default
    //private

     */
    private int length;
    private int breath;

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
   /*public void printAreaRectangle (){
        System.out.println("Area of Rectangle is "+length*breath);*/ //encapsulation aik capsule men sari chezen


    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
        System.out.println("im calling the rectangle constructor for constructing object");
    }
    public void area()
        {

        System.out.println("override"  + "Area of Rectangle is "+length*breath);
    }





}



