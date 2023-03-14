package ru.geekbrains.lesson_1.task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> listOfShapes = new ArrayList<>();

        listOfShapes.add(new Circle());
        listOfShapes.add(new Grid());
        listOfShapes.add(new Triangle());

        for (Shape shape :
                listOfShapes) {
            shape.doSomething();
        }

        System.out.println("-------------------------");

        System.out.println("Конец работы с фигурами.");

        System.out.println("-------------------------");

        for (Shape shape :
                listOfShapes) {
            shape.erase();
        }
    }
}
