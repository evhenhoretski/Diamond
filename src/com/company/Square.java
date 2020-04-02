package com.company;

public abstract class Square implements IGeometry
{
    private int a;


    public Square(int a) { this.a = a; }

    public Square() { }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    @Override

    public float getArea() { return a * a; }

    @Override

    public float getPerimeter() { return 4 * a; }

    @Override
    public float IGeometry() {
        return 0;
    }

    @Override
    public float getInscribedRadius() {
        return 0;
    }

    @Override
    public void setSide(double side) {

    }
}
