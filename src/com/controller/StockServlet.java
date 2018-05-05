package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ImpStock;
import com.entite.Stock;


/**
 * Servlet implementation class StockServlet
 */
@WebServlet( urlPatterns= "/StockServlet")
public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImpStock stockDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockServlet() {
        super();
        stockDao = new ImpStock();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/add").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			List<Stock> listStock = stockDao.liste();
	        request.setAttribute("listStock", listStock);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
	        dispatcher.forward(request, response);
	        
		 	Stock stock = new Stock();
		 	stock.setRef(request.getParameter("ref"));
	        stock.setLib(request.getParameter("libelle"));
	        stock.setQtStock(Double.parseDouble(request.getParameter("quantite")));
	        
	        if (stock!=null) {
	        	stockDao.add(stock);
			}
	            
	        
	        
	            
	            request.getRequestDispatcher("/add").forward(request, response);    
	           
	                
	}
	        
	}


