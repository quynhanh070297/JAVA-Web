package rikkei.miniproject.model.entity;

import lombok.*;

import javax.servlet.http.Part;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Product
{

        private int   Product_ID ;
        private String Name ;
        private String Image ;
        private String Description ;
        private Date Created_date ;
        private Integer Price ;
        private Boolean Status ;
        private Boolean Action ;
        private Integer Category ;

        @Override
        public String toString()
        {
                return "Product{" +
                        "Product_ID=" + Product_ID +
                        ", Name='" + Name + '\'' +
                        ", Image=" + Image +
                        ", Description='" + Description + '\'' +
                        ", Created_date=" + Created_date +
                        ", Price=" + Price +
                        ", Status=" + Status +
                        ", Action=" + Action +
                        '}';
        }
}
