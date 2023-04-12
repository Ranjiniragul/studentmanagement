package com.scl.pro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFeaturesimpl implements Studentfeatures{
	Connection con=null;

	@Override
	public  int AddStudent(Student stu) {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;

		int x=0;

		try {
			
			con=DriverMangerutil.getConnection();
			String sql="insert into Students values(?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);

			ps.setInt(1, stu.getSid());
			ps.setString(2, stu.getStuname());
			ps.setInt(3, stu.getGrade());
			ps.setString(4, stu.getSection());
			ps.setLong(5, stu.getYear());
			ps.setLong(6, stu.getNumber());
			ps.setString(7, stu.getEmail());
			ps.setString(8, stu.getGender());
			x=ps.executeUpdate();

		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DriverMangerutil.cleanup(ps, con);
		}
		return x;
	}

	@Override
	public int UpdateStudent(Student stu) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
		try {
			con=DriverMangerutil.getConnection();
String sql="update Students set stuname=?,grade=?,section=?,year=?,number=?,email=?,gender=? where sid=?";
ps=con.prepareStatement(sql);

			ps.setString(1, stu.getStuname());
			ps.setInt(2, stu.getGrade());
			ps.setString(3, stu.getSection());
			ps.setLong(4, stu.getYear());
			ps.setLong(5, stu.getNumber());
			ps.setString(6, stu.getEmail());
			ps.setString(7, stu.getGender());
			ps.setInt(8, stu.getSid());

			x=ps.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DriverMangerutil.cleanup(ps, con);
		}
		return x;

	}

	@Override
	public void DeleteStudent(int sid) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
		try {
			con=DriverMangerutil.getConnection();
			String sql="delete from Students where sid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, sid);
			x=ps.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DriverMangerutil.cleanup(ps, con);
		}

	}

	@Override
	public List <Student> GetAllStudent() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Student> list=new ArrayList<>();
		try {
			con=DriverMangerutil.getConnection();
			String sql="select* from Students";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
			Student	stu=new Student();
				stu.setSid(rs.getInt(1));
				stu.setStuname(rs.getString(2));
				stu.setGrade(rs.getInt(3));
				stu.setSection(rs.getString(4));
				stu.setYear(rs.getLong(5));
				stu.setNumber(rs.getLong(6));
				stu.setEmail(rs.getString(7));
				stu.setGender(rs.getString(8));
				list.add(stu);

			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DriverMangerutil.cleanup(rs, ps, con);
		}
		
		return list;
	}

}
