package ru.geekbrains.lesson_1.task_3;

abstract class Shape implements Drawable, Eraseable {
    public void doSomething() {
        erase();
        draw();
    }
}
