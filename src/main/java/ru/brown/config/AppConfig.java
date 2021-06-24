package ru.brown.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.BeanDefinitionDsl;
import ru.brown.Circle;
import ru.brown.Coords;
import ru.brown.GraphicalScene;
import ru.brown.Point;

@Configuration
public class AppConfig {

//    <bean id="pointCoords" class="ru.brown.Coords">
//        <constructor-arg value="5"/>
//        <constructor-arg value="5"/>
//    </bean>
//
//    <bean id="pointBean" class="ru.brown.Point">
//        <constructor-arg ref="pointCoords"/>
//    </bean>
    @Bean(name = "pointCoords")
    public Coords pointCoordinates() {
        return new Coords("5", "5");
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Point pointBean(@Qualifier("pointCoords")Coords coords) {
        return new Point(coords);
    }

//    <bean id="circleCoords" class="ru.brown.Coords">
//        <constructor-arg value="3"/>
//        <constructor-arg value="3"/>
//    </bean>
//
//    <bean id="circleBean" class="ru.brown.Circle">
//        <constructor-arg ref="pointCoords"/>
//        <constructor-arg value="3"/>
//    </bean>
    @Bean(name = "circleCoords")
    public Coords circeCoords(){
        return new Coords("3","3");

    }

    @Bean("circeCoords")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Circle circleBean(@Qualifier("circleCoords") Coords coords) {
        return new Circle(coords, 4);
    }

//    <bean id="sceneCoordinatesBean" class="ru.brown.Coords">
//        <constructor-arg value="10"/>
//        <constructor-arg value="10"/>
//    </bean>
//    <bean id="sceneBean" class="ru.brown.GraphicalScene" init-method="setDefaultScene">
//        <constructor-arg ref="sceneCoordinatesBean"/>
//    </bean>
    @Bean(name = "sceneCoords")
    public Coords sceneCoordsBean () {
        return new Coords("10","10");
    }

    @Bean()
    public GraphicalScene sceneBean(@Qualifier("sceneCoords") Coords coords) {
        return new GraphicalScene(coords, "green");
    }
}
