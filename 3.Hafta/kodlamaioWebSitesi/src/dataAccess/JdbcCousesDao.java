package dataAccess;

import entities.Courses;

public class JdbcCousesDao implements ICoursesDao{
    @Override
    public void add(Courses courses) {
        System.out.println("Kurs Jdbc ile veritabanına eklendi: " + courses.getName());
    }

    @Override
    public void delete(Courses courses) {
        System.out.println("Kurs Jdbc ile veritabanından silindi: " + courses.getName());
    }

}
