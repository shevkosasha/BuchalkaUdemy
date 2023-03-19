package org.course.generics.challenge1;

import java.util.Arrays;

public interface Mappable {
    void render();
    static double[] stringToLocation(String location){
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat,lng};
    }
}

abstract class Point implements Mappable{
    private double[] location = new double[2];
    public Point(String location) {
        this.location = Mappable.stringToLocation(location);
    }
    @Override
    public void render() {
        System.out.println("Render " + this + " as a POINT (" + location() + "");
    }
    private String location(){
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable{
    private double[][] locations;// = new double[2][2];

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations){
            this.locations[index++] = Mappable.stringToLocation(l);
        }
//        this.location = location;
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as a Line (" + location() + "");
    }

    private String location(){
        return Arrays.deepToString(locations);
    }
}
