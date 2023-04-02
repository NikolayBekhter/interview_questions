package ru.geekbrains.lesson_5.dao;

import ru.geekbrains.lesson_5.entities.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    void deleteById(Long id);
    void update(Student student);
    Student findById(Long id);
    List<Student> findAll();
    void addStudents();
}
