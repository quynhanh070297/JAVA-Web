package rikkei.miniproject.controller;

import rikkei.miniproject.model.entity.Product;
import rikkei.miniproject.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductSeverlet", value = "/ProductSeverlet")
public class ProductSeverlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ProductService ps = new ProductService();
        String action = request.getParameter("action");
        switch (action){
            case "productPage":
                request.setAttribute("ListProduct",ps.fillAll() );
                request.getRequestDispatcher("/product.jsp").forward(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}