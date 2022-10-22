package dataAccess;
import entities.Courses;

//hem bunda hem Categoryde upadete (aynı metodu) kullandım ???
public interface ICoursesDao{
    void add(Courses courses);
    void delete(Courses courses);
}
