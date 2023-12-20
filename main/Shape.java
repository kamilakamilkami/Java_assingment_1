package main;

import java.lang.Math;


public class Shape {
    private Point[] points;
    private double perimetr = 0;
    private double avg_len = 0;
    private int i = 0;

    Shape(){
        this.points = new Point[10];
    }

    public void addPoint(Point point){
        points[i++] = point; 
    }
    public double getLongestSide(){
        if(this.avg_len != 0){
            return this.avg_len;
        }
        double ans = 0;
        for(int i=0;i<this.points.length; ++i){
            double c = 0;
            if(i == this.points.length-1){
                c = Math.sqrt(Math.pow(this.points[i].getX() - this.points[0].getX(), 2.0) + Math.pow(this.points[i].getY() - this.points[0].getY(), 2.0));
            }
            else{
                c = Math.sqrt(Math.pow(this.points[i].getX() - this.points[i+1].getX(), 2.0) + Math.pow(this.points[i].getY() - this.points[i+1].getY(), 2.0));
            }
            if(c > ans){
                ans = c; 
            }
        }
        return ans;
    }

    public double calculatePerimetr(){
        if(this.perimetr != 0){
            return this.perimetr;
        }
        double perimetr = 0;
        for(int i=0;i<this.points.length; ++i){
            if(i == this.points.length-1){
                perimetr += Math.sqrt(Math.pow(this.points[i].getX() - this.points[0].getX(), 2.0) + Math.pow(this.points[i].getY() - this.points[0].getY(), 2.0));
            }
            else{
                perimetr += Math.sqrt(Math.pow(this.points[i].getX() - this.points[i+1].getX(), 2.0) + Math.pow(this.points[i].getY() - this.points[i+1].getY(), 2.0));
            }
        }
        return perimetr;
    }

    public double getAverageSide(){
        if(this.perimetr != 0){
            return this.perimetr/this.points.length;
        }
        return this.calculatePerimetr()/this.points.length;
    }

}
