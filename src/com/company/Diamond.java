package com.company;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Objects;


public abstract class Diamond implements IGeometry {
    private float sideA;
    private float angleA;


    //public Diamond(float sideA) { }


    public Diamond(float sideA, float angleA)
    {
        this.sideA = sideA;
        this.angleA = angleA;
    }


    public float getSideA()
    {
        return sideA;
    }
    public void setSideA(float sideA)
    {
        this.sideA = sideA;
    }



    public float getAngleA() { return (float) Math.sqrt(3)/2; }


    public float getPerimeter()
    {
        return 2 * (this.sideA + this.sideA);
    }

    private double side;


    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }

    public Diamond(float side)
    {
        // (side, 1/2);
        this.side = side;
    }

    public float getInscribedRadius()
    {
        return (float)((getArea() /  (2 * this.side)));
    }

    public float getDescribedRadius()
    {
        return (float)((this.side * Math.sqrt(2))) / 2;
    }

    public float getArea()
    {
        return (float)(Math.pow(this.sideA, 2) * Math.sqrt(3)/2);
    }


    public boolean isIsosceles()
    {
        return (this.sideA == this.sideA);
    }


    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Diamond))
            return false;

        Diamond diamond = (Diamond) obj;

        return Double.compare(diamond.getSideA(), getSideA()) == 0 &&
                Double.compare(diamond.getAngleA(), getAngleA()) == 0;
    }


    public int hashCode()
    {
        return Objects.hash(getSideA(), getAngleA());
    }


    public String toString()
    {
        return "Diamond{" + "sideA = " + sideA +
                ", angleA = " + angleA +
                ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter() +
                ", Radius = " + this.getInscribedRadius() +
                ", radius = " + this.getDescribedRadius() +
                ", is isosceles=" + this.isIsosceles() + '}';

    }
}