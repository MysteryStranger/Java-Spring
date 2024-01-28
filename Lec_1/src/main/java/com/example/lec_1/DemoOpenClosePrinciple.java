package com.example.lec_1;

public class DemoOpenClosePrinciple {
}

interface Shape{
    double area();
}
class Circle implements Shape{
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    double height;
    double width;

    @Override
    public double area() {
        return width * height;
    }
}

class AreaCalculator{
    void printArea(Shape s){
        //pi * r*r
        System.out.println(s.area());
    }

    void printArea(Rectangle rectangle){
        //height * width
        System.out.println(rectangle.height * rectangle.width);
    }
}

class Student{
    //props
    String name;
    String SkinColor;
}
class Fish extends Student{ //Class fish do not right to extends in Student

}

interface ClickListener {
    void onClick();
    void onDoubleClick();
    void onLongClick();
}
class Polygon implements ClickListener{
    @Override
    public void onClick() {
        System.out.println("Clicked");

    }

    @Override
    public void onDoubleClick() {

    }

    @Override
    public void onLongClick() {

    }
}
