package com.company;

public interface IGeometry
{
    void setSide();

    float getArea();
    float getPerimeter();

    double side = 0;


    static double getSide()
    {
        return side;
    }

    //static void setSide() { }

    public float IGeometry();

    public abstract float getInscribedRadius();
    public abstract float getDescribedRadius();

    public String toString();

    //void setSide();

    void setSide(double side);
}
