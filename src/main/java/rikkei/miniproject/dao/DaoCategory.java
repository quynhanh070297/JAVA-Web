package rikkei.miniproject.dao;

import rikkei.miniproject.model.entity.Category;
import rikkei.miniproject.until.ConnectDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DaoCategory
{
    public List<Category> list (){
        Connection conn = ConnectDB.getConnection();
        try
        {
            ResultSet rs = conn.prepareStatement("select * from Category ").executeQuery();
            List<Category> categories = new ArrayList<>();
            while (rs.next())
            {
                Category category = new Category();
                category.setCategory_ID(rs.getInt("Category_ID"));
                category.setName(rs.getString("Name"));
                category.setDescripttion(rs.getString("Descripttion"));
                category.setAction(rs.getBoolean("Action"));
                category.setCreated_Date(rs.getDate("Created_Date"));
                categories.add(category);
            }
            return categories;

        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }finally
        {
            ConnectDB.closeConnection(conn);
        }

    }

}
