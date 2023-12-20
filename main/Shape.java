package main;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;
    private double perimetr = 0;
    private double avg_len = 0;
    private int i = 0;

    Shape(){
        this.points = new ArrayList<Point>();
    }

    public void addPoint(Point point){
        this.points.add(point); 
    }
    public double getLongestSide(){
        if(this.avg_len != 0){
            return this.avg_len;
        }
        double ans = 0;
        for(int i=0;i<this.points.size(); ++i){
            double c = 0;
            if(i == this.points.size()-1){
                c = this.points.get(i).getDistanceToOtherPoint(this.points.get(0));
            }
            else{
                c = this.points.get(i).getDistanceToOtherPoint(this.points.get(i+1));
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
        for(int i=0;i<this.points.size(); ++i){
            if(i == this.points.size()-1){
                perimetr += this.points.get(i).getDistanceToOtherPoint(this.points.get(0));
            }
            else{
                perimetr += this.points.get(i).getDistanceToOtherPoint(this.points.get(i+1));
            }
        }
        return perimetr;
    }

    public double getAverageSide(){
        if(this.perimetr != 0){
            return this.perimetr/this.points.size();
        }
        return this.calculatePerimetr()/this.points.size();
    }

}
