package com.scl.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="updatestudent", urlPatterns="/updatestudent.jsp")
public class UpdateStudent extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
	rd.forward(request, response);
	try {
		int id=Integer.parseInt(request.getParameter("sid"));
	String name=request.getParameter("stuname");
	int group=Integer.parseInt(request.getParameter("group"));
	String section=request.getParameter("section");
	Long year=Long.parseLong(request.getParameter("year"));
	Long number=Long.parseLong(request.getParameter("number"));
	String email=request.getParameter("email");
	String gender=request.getParameter("gender");

		Student stu=new Student(id,name,group,section,year,number,email,gender);
		System.out.println("stu"+stu);
	StudentFeaturesimpl impl=new StudentFeaturesimpl();
	int x=impl.UpdateStudent(stu);
	
	}catch(Exception ex) {
		ex.printStackTrace();
	}


	
	
	}

}
