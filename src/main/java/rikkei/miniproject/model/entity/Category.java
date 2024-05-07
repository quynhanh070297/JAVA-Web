package rikkei.miniproject.model.entity;

import java.util.Date;

public class Category
{
    private int Category_ID ;
    private String Name ;
    private String Descripttion ;
    private Date Created_Date ;
    private Boolean Action ;

    public Category()
    {
    }

    public Category(int category_ID, String name, String descripttion, Date created_Date, Boolean action)
    {
        Category_ID = category_ID;
        Name = name;
        Descripttion = descripttion;
        Created_Date = created_Date;
        Action = action;
    }

    public int getCategory_ID()
    {
        return Category_ID;
    }

    public void setCategory_ID(int category_ID)
    {
        Category_ID = category_ID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getDescripttion()
    {
        return Descripttion;
    }

    public void setDescripttion(String descripttion)
    {
        Descripttion = descripttion;
    }

    public Date getCreated_Date()
    {
        return Created_Date;
    }

    public void setCreated_Date(Date created_Date)
    {
        Created_Date = created_Date;
    }

    public Boolean getAction()
    {
        return Action;
    }

    public void setAction(Boolean action)
    {
        Action = action;
    }
}
