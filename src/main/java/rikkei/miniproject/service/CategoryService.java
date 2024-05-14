package rikkei.miniproject.service;

import rikkei.miniproject.dao.DaoCategory;
import rikkei.miniproject.model.entity.Category;

import java.util.List;

public class CategoryService
{
    DaoCategory daoCategory = new DaoCategory();
    public List<Category> fillAll  (){
        return daoCategory.list();
    }

}
