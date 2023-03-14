package ru.geekbrains.lesson_1.task_3;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle::erase");
    }
}
