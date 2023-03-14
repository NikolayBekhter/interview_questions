package ru.geekbrains.lesson_1.task_2;

class LightWeightCar extends Car implements Moveable, Stopable {
    @Override
    void start() {
        System.out.println("Car starting");
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
