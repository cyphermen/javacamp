package business;

import core.logging.ILogger;
import dataAccess.ICoursesDao;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICoursesDao coursesDao;
    private ILogger[] loggers;
    private ArrayList<Courses> courses = new ArrayList<Courses>();

    public CourseManager(ICoursesDao coursesDao, ILogger[] loggers) {
        this.coursesDao = coursesDao;
        this.loggers = loggers;
    }

    public void add(Courses coursess) throws Exception {
        for (Courses course : courses) {
            if (course.getName() == coursess.getName()) {
                throw new Exception("Kurs ismi zaten mevcut.");
            }
        }

        if (coursess.getPrice() < 0) {

            throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
        }
        coursesDao.add(coursess);
        courses.add(coursess);

        for (ILogger logger : loggers) {
            logger.log(coursess.getName());
        }
    }
}
