package ru.geekbrains.lesson_1.task_3;

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle::draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle::erase");
    }
}
