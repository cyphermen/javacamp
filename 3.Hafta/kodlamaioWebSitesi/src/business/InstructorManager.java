package business;

import core.logging.ILogger;
import dataAccess.IInstructorDap;
import entities.Courses;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private IInstructorDap instructorDao;
    private ILogger[] loggers;
    private ArrayList<Instructor> instructors = new ArrayList<Instructor>();


    public InstructorManager(IInstructorDap instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        for (Instructor instructor1 : instructors) {
            if (instructor1.getName() == instructor.getName()) {
                throw new Exception("Eğitimci ismi zaten mevcut");
            }
        }

        instructorDao.add(instructor);
        instructors.add(instructor);

        for (ILogger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}
