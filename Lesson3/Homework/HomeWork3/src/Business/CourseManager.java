/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Configuration.Logger;
import DataAccess.CategoryDao;
import DataAccess.CourseDao;
import Entity.Category;
import Entity.Course;
import java.util.ArrayList;

/**
 *
 * @author erdem
 */
public class CourseManager {

    private CourseDao curseDao;
    private Logger[] logger;

    public CourseManager(CourseDao curseDao, Logger[] logger) {
        this.curseDao = curseDao;
        this.logger = logger;
    }

    //Kurs ekleme
    public void add(Course course) {
        //Kurs daha önce eklenmiş mi?
        for (Course courseItem : getCourse()) {
            if (courseItem.getName().equals(course.getName())) {
                String hata = "Bu kurs daha önce eklenmiş.!";
                for (Logger lg : logger) {
                    lg.log(hata);
                }
                return;
            }
        }
        //Fiyat kontrol
        if (course.getPrice() <= 0) {
            for (Logger lg : logger) {
                lg.log("Girilen kurs fiyatı 0 dan küçük olamaz.!");
            }
            return;
        }
        curseDao.add(course);
        for (Logger lg : logger) {
            lg.log("Başarılı");
        }
    }

    //Rastgele kurslar
    public ArrayList<Course> getCourse() {
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "Java", 10));
        courseList.add(new Course(2, "Kotlin", 3));
        courseList.add(new Course(3, "Javascript", 5));
        courseList.add(new Course(4, "Sql", 6));
        courseList.add(new Course(5, "C#", 23));
        return courseList;
    }
}
