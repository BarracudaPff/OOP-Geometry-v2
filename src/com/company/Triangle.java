package com.company;

import java.awt.*;

public class Triangle {
//    Point first;
//    Point second;
//    Point third;
//    Color c;

    public Triangle(Point v1, Point v2, Point v3) {
        this.first = new Point(v1);
        this.second = new Point(v2);
        this.third = new Point(v3);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", edgeY=" + c +
                '}';
    }

    public void move(double dx, double dy) {
        first.move(dx, dy);
        second.move(dx, dy);
        third.move(dx, dy);
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public double getSurface() {
    }

    public double getPerimeter()

    public boolean isIsoceles()

    public boolean estEquilateral()

    public boolean isRectangle()
}
