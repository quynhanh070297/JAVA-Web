package rikkei.miniproject.service;

import rikkei.miniproject.dao.DaoCategory;
import rikkei.miniproject.dao.DaoProduct;
import rikkei.miniproject.model.entity.Category;
import rikkei.miniproject.model.entity.Product;

import java.util.List;

public class ProductService
{
    DaoProduct daoProduct = new DaoProduct();
    public List<Product> fillAll  (){
        return daoProduct.productsList();
    }

}
