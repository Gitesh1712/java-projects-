package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.HibernateUtil;
import com.entity.User;

@WebServlet("/userRegister")
public class Register_Servlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		String name=req.getParameter("fullName");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String about=req.getParameter("about");
		
		User u=new User(name,email,password,about);
		
//		System.out.println(u);
		
		UserDao dao=new UserDao(HibernateUtil.getSessionFactory());
		boolean f=dao.saveUser(u);
		
		HttpSession session=req.getSession();
		if(f==true)
		{	
			session.setAttribute("msg","Registered Succesfully");
//			System.out.println("Registered");
			res.sendRedirect("register.jsp");
		}
		else
		{
//			System.out.println("Not Registered.Something went wrong...");
			session.setAttribute("msg","Not Registered.Something went wrong...");
			res.sendRedirect("register.jsp");
		}
		
	}
}
