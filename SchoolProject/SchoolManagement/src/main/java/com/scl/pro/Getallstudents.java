package com.scl.pro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="getallstu",urlPatterns="/getallstudent.jsp")
public class Getallstudents extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		
		
		StudentFeaturesimpl impl=new StudentFeaturesimpl();
		List<Student> list=impl.GetAllStudent();
		for(Student stu:list) {
			int id=stu.getSid();
			String name= stu.getStuname();
			int grade= stu.getGrade();
			String sec= stu.getSection();
			long year= stu.getYear();
			long number= stu.getNumber();
			String email=stu.getEmail();
			String gender= stu.getGender();
			
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<table>");
		out.print("<tr>");
        out.print("<td>StudentId </td>");
	out.print("<td>"+id+"</td>");
	out.print("</tr>");
	
	out.print("<tr>");
    out.print("<td> StudentName </td> ");
out.print("<td>"+name+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>Class</td>");
out.print("<td>"+grade+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td> Section </td>");
out.print("<td>"+sec+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td> Year </td>");
out.print("<td>"+year+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td> Number </td>");
out.print("<td>"+number+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td> Email </td>");
out.print("<td>"+email+"</td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td> Gender </td>");
out.print("<td>"+gender+"</td>");
out.print("</tr>");
	out.print("<br/>");
	out.print("</table>");
	
		}
}
}