package main.models;

import java.lang.Math;


public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String getCoords(){
        return String.format("x = %f, y = %f\n", this.x, this.y);
    }

    public double getX(){
        return x;
    } 

    public double getY(){
        return y;
    }

    public double getDistance(Point point_2){
        return Math.sqrt(Math.pow(this.x - point_2.getX(), 2.0) + Math.pow(this.y - point_2.getY(), 2.0));
    }
}
