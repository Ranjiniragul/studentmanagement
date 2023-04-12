package com.scl.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="addstudent" ,urlPatterns="/addstudent.jsp")
public class AddStudent extends HttpServlet{
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
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
	System.out.println(stu);
StudentFeaturesimpl impl=new StudentFeaturesimpl();
int x=impl.AddStudent(stu);
response.setContentType("text/html");
PrintWriter out=response.getWriter();
if(x==1) {
	out.print("<h1>Student added Successfully</h1>");
}else {
	out.print("<h1>Oops!!! There is an Problem with adding Student,Try again Later</h1>");
}
}catch(Exception ex) {
	ex.printStackTrace();
}

}
}
