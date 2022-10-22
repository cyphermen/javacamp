package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDap{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitimci Jdbc ile veritabanına eklendi: " + instructor.getName());
    }
}
