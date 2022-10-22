package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private ArrayList<Category> categories = new ArrayList<Category>();


    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category categoryy : categories) {
            if (categoryy.getName() == category.getName()) {
                throw new Exception("Kategori ismi zaten mevcut.");
            }
        }


        categoryDao.add(category);
        categories.add(category);
        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }
    }

}
