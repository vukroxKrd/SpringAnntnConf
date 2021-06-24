package ru.brown;

public abstract class GraphicalObject {
    private Coords coordinates;

    public void draw(){
        System.out.printf("Drawing an object using coordinates X: s% and Y s%",coordinates.getX(),coordinates.getY());
    }
}
