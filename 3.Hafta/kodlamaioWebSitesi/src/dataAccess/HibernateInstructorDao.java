package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDap{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitimci Hibernate ile veritabanına eklendi: " + instructor.getName());
    }
}
