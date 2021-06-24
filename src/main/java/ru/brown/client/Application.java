package ru.brown.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.brown.Circle;
import ru.brown.GraphicalObject;
import ru.brown.GraphicalScene;
import ru.brown.Point;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        GraphicalScene scene = container.getBean(GraphicalScene.class);
        Point point = container.getBean(Point.class);
        Circle circle = container.getBean(Circle.class);
        List<GraphicalObject> figures = new ArrayList<>();
        figures.add(point);
        figures.add(circle);
        scene.setFigures(figures);
        scene.draw();
    }
}
