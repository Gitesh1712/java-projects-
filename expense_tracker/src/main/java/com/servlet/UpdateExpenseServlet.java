package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ExpenseDao;
import com.db.HibernateUtil;
import com.entity.Expense;
import com.entity.User;

@WebServlet("/updateExpense")
public class UpdateExpenseServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		String title =req.getParameter("title");
		String date =req.getParameter("date");
		String time =req.getParameter("time");
		String description =req.getParameter("description");
		String price =req.getParameter("price");
		
		//get user
		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("loginUser");
		
		
		Expense expense=new Expense(title, date, time, description, price, user);
		expense.setId(id);
		ExpenseDao dao=new ExpenseDao(HibernateUtil.getSessionFactory());
		
		boolean f=dao.updateExpense(expense);
		
		if(f==true)
		{	
			session.setAttribute("msg","Expense Updated Succesfully");
//			System.out.println("Expense added");
			resp.sendRedirect("user/view_expense.jsp");
		}
		else
		{
//			System.out.println("Expense Not Added.Something went wrong...");
			session.setAttribute("msg","Expense Not Updated.Something went wrong...");
			resp.sendRedirect("user/view_expense.jsp");
		}
		
	}
	
	
}
