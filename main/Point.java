package main;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    void getCoords(){
        System.out.printf("x = %d, y = %d\n", this.x, this.y);
    }

    public double getX(){
        return this.x;
    } 

    public double getY(){
        return this.y;
    }
}
