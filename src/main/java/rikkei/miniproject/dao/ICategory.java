package rikkei.miniproject.dao;

import rikkei.miniproject.model.entity.Category;
import rikkei.miniproject.model.entity.Product;

import java.util.List;

public interface ICategory
{
    List<Category> fillAll ();

    Product fillProductById(Integer id);

    void save(Category category);

    void delete(Integer id);
}
