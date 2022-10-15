
import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Configuration.DatabaseLogger;
import Configuration.FileLogger;
import Configuration.Logger;
import Configuration.MailLogger;
import DataAccess.HibernateDao;
import DataAccess.JdbcDao;
import Entity.Category;
import Entity.Course;
import Entity.Instructor;

/**
 *
 * @author erdem
 */
public class main {

    public static void main(String[] args) {
        Logger[] logs = {new FileLogger(), new MailLogger(), new DatabaseLogger()};
        //Eğitmen eklenmesi
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), logs);
        instructorManager.add(new Instructor(1, "Erdem", "Gençoğlu"));
        System.out.println("---------------------");
        //Kategori eklenmesi
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(), logs);
        categoryManager.add(new Category(10, "Security"));
        System.out.println("---------------------");
        //Kurs eklenmesi
        CourseManager courseManager = new CourseManager(new HibernateDao(), logs);
        courseManager.add(new Course(11, "Web programlama", 0));
    }

}
