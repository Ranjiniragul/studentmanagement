package com.scl.pro;

import java.sql.*;




public  class DriverMangerutil {
	public static Connection getConnection() {
		Connection con=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/scldb","root","123456");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	return con;
}
public static void cleanup(PreparedStatement ps,Connection con) {
	try {
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
public static void cleanup(ResultSet rs,PreparedStatement ps,Connection con) {
	try {
		if(rs!=null)
			rs.close();
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}

}
