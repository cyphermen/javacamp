package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori Jdbc ile veritabanına eklendi: " + category.getName() );
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori Jdbc ile veritabanından silindi: " + category.getName());
    }

    }

