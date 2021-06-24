package ru.brown;

import java.util.Collection;

public class GraphicalScene  extends GraphicalObject{
    private Coords coords;
    private String color;
    Collection<GraphicalObject> figures;

    @Override
    public void draw() {
        System.out.println("Scene's coordinates are: X "+coords.getX()+" Y: "+coords.getY());
        System.out.println("Figures contained on the scene are: ");
        for (GraphicalObject figure: this.figures){
            figure.draw();
        }
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public Collection<GraphicalObject> getFigures() {
        return figures;
    }

    public void setFigures(Collection<GraphicalObject> figures) {
        this.figures = figures;
    }

    public void setDefaultScene (){
        GraphicalScene scene = new GraphicalScene();
        Coords coords = new Coords("10","10");
        scene.setCoords(coords);
    }

    public GraphicalScene() {
    }

    public GraphicalScene(Coords coords) {
        this.coords = coords;

    }

    public GraphicalScene(Coords coords, String color) {
        this.coords = coords;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
