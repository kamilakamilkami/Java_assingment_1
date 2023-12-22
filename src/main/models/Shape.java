package main.models;

import java.util.ArrayList;
import java.util.List;

import main.helpers.Calculation;

public class Shape {

    private List<Point> points;

    public Shape(){
        this.points = new ArrayList<Point>();
    }

    public void addPoint(Point point){
        this.points.add(point); 
    }

    public double getLongestSide(){
        return Calculation.getMax(getSides());
    }

    public double calculatePerimeter(){
        return Calculation.getSum(getSides());
    }

    public double getAverageSide(){
        return Calculation.getAvg(getSides());
    }

    private double[] getSides(){
        double[] sides = new double[this.points.size()];
        for(int i = 0; i < points.size(); ++i){
            int nextIndex = (i + 1) % points.size();
            sides[i] = points.get(i).getDistance(this.points.get(nextIndex));
        }

        return sides;

    }

}
