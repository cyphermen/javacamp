package dataAccess;

import entities.Courses;

public class HibernateCoursesDao implements ICoursesDao{
    @Override
    public void add(Courses courses) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi: " + courses.getName());
    }

    @Override
    public void delete(Courses courses) {
        System.out.println("Kurs Hibernate ile veritabanından silindi: " + courses.getName());
    }

}
