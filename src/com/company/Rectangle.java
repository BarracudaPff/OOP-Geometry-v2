package com.company;

import java.awt.*;

public class Rectangle {
//    Point tl;
//    Point br;
//    Color c;

    public Rectangle(Point v, double edgeX, double edgeY) {
        this.tl = new Point(v);
        this.br = new Point(v.x + edgeX, v.y + edgeY);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "tl=" + tl +
                ", br=" + br +
                ", c=" + c +
                '}';
    }

    public void move(double dx, double dy) {
        tl.move(dx, dy);
        br.move(dx, dy);
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public double getSurface() {
        return 2 * (tl.distanceXTo(br) + tl.distanceYTo(br));
    }

    public double getPerimeter() {
        return tl.distanceXTo(br) * tl.distanceYTo(br);
    }
}
