package com.scl.pro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="deletestu",urlPatterns="/deletestudent.jsp")
public class DeleteStudent extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			rd.forward(request, response);
			int id=Integer.parseInt(request.getParameter("sid"));
			Student stu=new Student(id);
			StudentFeaturesimpl impl=new StudentFeaturesimpl();
			impl.DeleteStudent(id);
}
}