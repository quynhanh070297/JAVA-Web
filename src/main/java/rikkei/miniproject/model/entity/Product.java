package rikkei.miniproject.model.entity;

import javax.servlet.http.Part;
import java.util.Date;

public class Product
{

        private int   Product_ID ;
        private String Name ;
        private Part Image ;
        private String Description ;
        private Date Created_date ;
        private int Price ;
        private int Status ;
        private Boolean Action ;


        public Product()
        {
        }

        public Product(int product_ID, String name, Part image, String description, Date created_date, int price, int status, Boolean action)
        {
                Product_ID = product_ID;
                Name = name;
                Image = image;
                Description = description;
                Created_date = created_date;
                Price = price;
                Status = status;
                Action = action;
        }

        public int getProduct_ID()
        {
                return Product_ID;
        }

        public void setProduct_ID(int product_ID)
        {
                Product_ID = product_ID;
        }

        public String getName()
        {
                return Name;
        }

        public void setName(String name)
        {
                Name = name;
        }

        public Part getImage()
        {
                return Image;
        }

        public void setImage(Part image)
        {
                Image = image;
        }

        public String getDescription()
        {
                return Description;
        }

        public void setDescription(String description)
        {
                Description = description;
        }

        public Date getCreated_date()
        {
                return Created_date;
        }

        public void setCreated_date(Date created_date)
        {
                Created_date = created_date;
        }

        public int getPrice()
        {
                return Price;
        }

        public void setPrice(int price)
        {
                Price = price;
        }

        public int getStatus()
        {
                return Status;
        }

        public void setStatus(int status)
        {
                Status = status;
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
