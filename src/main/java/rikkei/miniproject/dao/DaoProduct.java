package rikkei.miniproject.dao;

import rikkei.miniproject.model.entity.Category;
import rikkei.miniproject.model.entity.Product;
import rikkei.miniproject.until.ConnectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoProduct
{
    public List<Product> productsList(){
            Connection conn = ConnectDB.getConnection();
            try
            {
                ResultSet rs = conn.prepareStatement("select * from Product ").executeQuery();
                List<Product> products = new ArrayList<>();
                while (rs.next())
                {
                    Product product = new Product();
                    product.setProduct_ID(rs.getInt("Product_ID"));
                    product.setName(rs.getString("Name"));
                    product.setDescription(rs.getString("Description"));
                    product.setAction(rs.getBoolean("Action"));
                    product.setCreated_date(rs.getDate("Created_date"));
                    product.setPrice(rs.getInt("Price"));
                    product.setStatus(rs.getBoolean("Status"));
                    product.setImage(rs.getString("Image"));
                    products.add(product);
                }
                return products;

            } catch (SQLException e)
            {
                throw new RuntimeException(e);
            }finally
            {
                ConnectDB.closeConnection(conn);
            }

        }

    public static void main(String[] args)
    {
        System.out.println(new DaoProduct().productsList().toString());
    }
    }


