/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Entity.Category;
import Entity.Course;
import Entity.Instructor;

/**
 *
 * @author erdem
 */
public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {

    @Override
    public void add(Category category) {
        System.out.println("HiberNate : Kategori eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println("HiberNate : Kurs eklendi");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("HiberNate : Eğitmen eklendi");
    }

}
