package main;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Point> points;

    public Shape(){
        this.points = new ArrayList<Point>();
    }

    public void addPoint(Point point){
        this.points.add(point); 
    }

    public double getLongestSide(){
        return this.calculations()[0];
    }

    public double calculatePerimeter(){
        return this.calculations()[1];
    }

    public double getAverageSide(){
        return this.calculatePerimeter()/this.points.size();
    }


    private double[] calculations(){
        double[] ans = {0,0};
        for(int i=0;i<this.points.size(); ++i){
            double c = 0;
            if(i == this.points.size()-1){
                c = this.points.get(i).getDistanceToOtherPoint(this.points.get(0));
            }
            else{
                c = this.points.get(i).getDistanceToOtherPoint(this.points.get(i+1));
            }
            if(c > ans[0]){
                ans[0] = c; 
            }
            ans[1] += c;
        }
        return ans;
    }

}
