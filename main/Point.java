package main;

import java.lang.Math;


public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void getCoords(){
        System.out.printf("x = %d, y = %d\n", this.x, this.y);
    }

    public double getX(){
        return this.x;
    } 

    public double getY(){
        return this.y;
    }

    public double getDistanceToOtherPoint(Point point_2){
        return Math.sqrt(Math.pow(this.x - point_2.getX(), 2.0) + Math.pow(this.y - point_2.getY(), 2.0));
    }
}
