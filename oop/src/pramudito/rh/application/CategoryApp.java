package pramudito.rh.application;

import pramudito.rh.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(123123);

        System.out.println(category.getId());
    }
}
