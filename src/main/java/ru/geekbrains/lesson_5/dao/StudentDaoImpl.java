package ru.geekbrains.lesson_5.dao;

import org.hibernate.Session;
import ru.geekbrains.lesson_5.entities.Student;
import ru.geekbrains.lesson_5.utils.SessionFactoryUtils;

import java.util.*;

public class StudentDaoImpl implements StudentDao {
    SessionFactoryUtils sessionFactory;

    public StudentDaoImpl(SessionFactoryUtils sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Student student) {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Student student) {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            Student studentFromDb = session.get(Student.class, student.getId());
            if (student.getName() != null) {
                studentFromDb.setName(student.getName());
            }
            if (student.getMark() != 0) {
                studentFromDb.setMark(student.getMark());
            }
            session.getTransaction().commit();
        }
    }

    @Override
    public Student findById(Long id) {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public List<Student> findAll() {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            List<Student> students = session.createQuery("select student from Student student").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    @Override
    public void addStudents() {
        try (Session session = sessionFactory.getSession()) {
            session.beginTransaction();
            Random random = new Random();
            for (int i = 1; i <= 1000; i++) {
                String name = "Student " + i;
                int mark = random.nextInt(10) + 1;
                session.saveOrUpdate(new Student(name, mark));
            }
            session.getTransaction().commit();
        }
    }
}
