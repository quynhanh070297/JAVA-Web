package rikkei.miniproject.controller;

import rikkei.miniproject.model.entity.Category;
import rikkei.miniproject.service.CategoryService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoryServelet", value = "/CategoryServelet")
public class CategoryServelet extends HttpServlet
{
    CategoryService ca = new CategoryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String action = request.getParameter("action");
        switch (action){
            case "categoryPage":
                request.setAttribute("Listcategory", ca.fillAll() );
                request.getRequestDispatcher("/category.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}