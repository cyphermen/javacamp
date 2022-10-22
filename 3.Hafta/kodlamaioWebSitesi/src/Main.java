import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.HibernateCoursesDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Courses;
import entities.Instructor;

public class Main {

    public static void main(String[] args) throws Exception {

        Courses course1=new Courses(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR) ",0,"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.","Engin Demirog");
        Courses course2=new Courses(2,"Senior Yazılım Geliştirici Yetiştirme Kampı (.NET) ",0,"Senior Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.","Engin Demirog");
        Courses course3=new Courses(3,"(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA ",0,"","Engin Demirog");
        Courses course4=new Courses(4,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript) ",0,"1.5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.","Engin Demirog");
        Courses course5=new Courses(5,"Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT) ",0,"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip,döküman ve duyurularını buradan yapacağız.","Engin Demirog");
        Courses course6=new Courses(6,"Programlamaya Giriş İçin Temel Kurs ",0,"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.","Engin Demirog");

        ILogger[] loggers = {new DatabaseLogger()};

        CourseManager courseManager=new CourseManager(new HibernateCoursesDao(),loggers);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.add(course4);
        courseManager.add(course5);
        courseManager.add(course6);

        System.out.println("---------------------------------");

        ILogger[] loggers2= {new FileLogger()};

        Category category1=new Category(1,"Tümü");
        Category category2=new Category(2,"Programlama");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers2);
        categoryManager.add(category1);
        categoryManager.add(category2);

        System.out.println("--------------------");

        ILogger[] loggers3 = {new MailLogger()};

        Instructor instructor = new Instructor(1,"Engin Demirog");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers3);
        instructorManager.add(instructor);

    }
}
