package com.company;

public abstract class DiamondService implements IGeometry, IInfo
{
    private Diamond diamond;


    public DiamondService(Diamond diamond) { this.diamond = diamond; }

    public DiamondService() { }

    @Override
    public float getInscribedRadius() {
        return 0;
    }

    //@Override
    public void setSide() { }

    public Diamond getDiamond() { return diamond; }
    public void setDiamond(Diamond diamond) { this.diamond = diamond; }

    @Override
    public float getArea() { return 0; }

    @Override
    public float getPerimeter() { return 0; }

    @Override
    public void setSide(double side) {

    }

    @Override
    public void show() { }

    @Override
    public String toXML() { return null; }

    @Override
    public String toJSON() { return null; }
}
