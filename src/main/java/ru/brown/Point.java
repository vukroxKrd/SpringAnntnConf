package ru.brown;

public class Point extends GraphicalObject {

    private Coords coords;

    public Point(Coords coords) {
        this.coords = coords;
    }

    @Override
    public void draw() {
        System.out.printf("X is:" + coords.getX() + " Y is: " + coords.getY());
        ;
    }

    @Override
    public String toString() {
        return "ru.brown.Point is located: X" + coords.getX() + " Y: " + coords.getY();
    }
}
