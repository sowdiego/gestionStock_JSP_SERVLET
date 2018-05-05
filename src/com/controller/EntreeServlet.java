package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ImpEntree;
import com.entite.Entree;

/**
 * Servlet implementation class EntreeServlet
 */
@WebServlet("/Entree")
public class EntreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String INSERT_ENTREE = "/add.jsp";
    private static String LIST_ENTREE = "/list.jsp";
    private ImpEntree daoEntree;

    public EntreeServlet() {
        super();
        daoEntree = new ImpEntree();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

//        if (action.equalsIgnoreCase("delete")){
//            int idE = Integer.parseInt(request.getParameter("idE"));
//            daoEntree.delete(idE);
//            forward = LIST_ENTREE;
//            request.setAttribute("entrees", daoEntree.liste());    
//        } else if (action.equalsIgnoreCase("edit")){
//            forward = INSERT_OR_EDIT;
//            int userId = Integer.parseInt(request.getParameter("userId"));
//            User user = dao.getUserById(userId);
//            request.setAttribute("user", user);
//        } else if (action.equalsIgnoreCase("listUser")){
//            forward = LIST_USER;
//            request.setAttribute("users", dao.getAllUsers());
//        } else {
//            forward = INSERT_OR_EDIT;
//        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
       
    }

}
