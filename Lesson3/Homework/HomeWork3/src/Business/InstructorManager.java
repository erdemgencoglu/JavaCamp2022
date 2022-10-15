/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Configuration.Logger;
import DataAccess.InstructorDao;
import Entity.Instructor;

/**
 *
 * @author erdem
 */
public class InstructorManager {

    private InstructorDao instructorDao;
    private Logger[] logger;

    public InstructorManager(InstructorDao instructorDao, Logger[] logger) {
        this.instructorDao = instructorDao;
        this.logger = logger;
    }
    //Eğitmen ekleme
    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger lg : logger) {
            lg.log("Başarılı");
        }
    }
}
