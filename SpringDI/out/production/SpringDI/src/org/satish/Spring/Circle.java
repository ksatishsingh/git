package org.satish.Spring;

public class Circle implements Shape{
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("this circlr is drawn with center point as "+"("+getCenter().getX()+","+getCenter().getY()+")");
    }
}
