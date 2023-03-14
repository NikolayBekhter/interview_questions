package ru.geekbrains.lesson_1.task_3;

class Grid extends Shape {
    @Override
    public void draw() {
        System.out.println("Grid::draw");
    }

    @Override
    public void erase() {
        System.out.println("Grid::erase");
    }
}
