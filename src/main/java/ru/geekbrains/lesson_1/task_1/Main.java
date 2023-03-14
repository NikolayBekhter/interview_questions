package ru.geekbrains.lesson_1.task_1;

public class Main {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .firstName("Nikolay")
                .lastName("Nikolaev")
                .middleName("Nikolaevich")
                .age(35)
                .gender("male")
                .country("Russia")
                .address("Moscow")
                .phone("+79101234567")
                .build();

        System.out.println(person);
    }
}
