package ru.geekbrains.lesson_5;

import ru.geekbrains.lesson_5.dao.StudentDao;
import ru.geekbrains.lesson_5.dao.StudentDaoImpl;
import ru.geekbrains.lesson_5.entities.Student;
import ru.geekbrains.lesson_5.utils.SessionFactoryUtils;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactory = new SessionFactoryUtils();
        sessionFactory.init();

        try {
            StudentDao studentDao = new StudentDaoImpl(sessionFactory);
            studentDao.addStudents();

            System.out.println(studentDao.findById(1L));

            studentDao.update(new Student(1L, "UPDATED STUDENT", 1));

            System.out.println(studentDao.findById(1L));

            studentDao.save(new Student("NEW STUDENT", 10));

            studentDao.findAll().forEach(System.out::println);
            System.out.println(studentDao.findById(1001L));

            studentDao.deleteById(1001L);
            studentDao.findAll().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.shutDown();
        }
    }
}
