package ru.brown;

public class Circle extends GraphicalObject {
    private Coords coords;
    private int radius;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(Coords coords, int radius) {
        this.coords = coords;
        this.radius = radius;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("X is: " + coords.getX() + "|| Y is: " + coords.getY() + "|| radius is: " + radius);
    }

    @Override
    public String toString() {
        return "ru.brown.Circle's center is located: X" + coords.getX() + " Y: " + coords.getY() + "The radius of the circle is: " + radius;
    }
}
