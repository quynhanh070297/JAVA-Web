package rikkei.miniproject.model.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class Category
{
    private int Category_ID;
    private String Name;
    private String Descripttion;
    private Date Created_Date;
    private Boolean Action;

    @Override
    public String toString()
    {
        return "Category{" +
                "Category_ID=" + Category_ID +
                ", Name='" + Name + '\'' +
                ", Descripttion='" + Descripttion + '\'' +
                ", Created_Date=" + Created_Date +
                ", Action=" + Action +
                '}';
    }
}
