package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements  ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanına eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori Hibernate ile veritabanından silindi: " + category.getName());
    }
}
