/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Configuration.Logger;
import DataAccess.CategoryDao;
import Entity.Category;
import java.util.ArrayList;

/**
 *
 * @author erdem
 */
public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] logger;

    public CategoryManager(CategoryDao categoryDao, Logger[] logger) {
        this.categoryDao = categoryDao;
        this.logger = logger;
    }

    //Kategori ekleme
    public void add(Category category) {
        for (Category categoryItem : getCategories()) {
            if (categoryItem.getName().equals(category.getName())) {
                String hata = "Bu kategori daha önce eklenmiş.!";
                for (Logger lg : logger) {
                    lg.log(hata);
                }
                return;
            }
        }
        categoryDao.add(category);
        for (Logger lg : logger) {
            lg.log("Başarılı");
        }
    }

    //Rastgele kategoriler
    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Web"));
        categories.add(new Category(2, "Mobil"));
        categories.add(new Category(3, "Backend"));
        categories.add(new Category(4, "Data Science"));
        categories.add(new Category(5, "Ui"));
        return categories;
    }

}
