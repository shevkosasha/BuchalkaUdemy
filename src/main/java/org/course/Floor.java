package org.course;

public class Floor {
    public static void main(String[] args) {
        System.out.println("h");
    }

    private double width, length;

    public Floor(double width, double length){
        this.width = (width >= 0) ? width : 0;
        this.length = (length >= 0) ? length : 0;
    }

    public double getWidth(){return this.width;}
    public double getLength(){ return this.length;}

    public void setWidth(double width){
        this.width = (width >= 0) ? width : 0;
    }
    public void setLength(double length){
        this.length = (length >= 0) ? length : 0;
    }
    public double getArea(){
        return this.length * this.width;
    }
}
/*
* 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.

The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0,
* in case the length parameter is less than 0 it needs to set the length field value to 0.

Write the following methods (instance methods):

Method named getArea without any parameters, it needs to return the calculated area (width * length).

*/