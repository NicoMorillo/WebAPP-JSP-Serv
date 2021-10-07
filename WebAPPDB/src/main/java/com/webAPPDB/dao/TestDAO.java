package com.webAPPDB.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.webAPPDB.model.Regis;

public class TestDAO {
	private Conection con;
	
	public TestDAO(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con= new Conection(jdbcURL, jdbcUserName, jdbcPassword);
		//con.connection();
		System.out.println(con.getJdbcConnection());
		
	}
	
	public boolean register(Regis a) {
		boolean state=false;
		Statement stm;
	
		
		String sql="INSERT INTO customers VALUES(NULL,'"+a.getRegistered()+"','"+a.getEmail()+"','"+a.getTitle()+"','"+a.getFirst_name()+"','"+a.getLast_name()+"','"+a.getAddress_line1()+"','"+a.getAddress_line2()+"','"+a.getCity()+"','"+a.getPostcode()+"','"+a.getTelephone()+"')";
		String sql2="INSERT INTO sites VALUES(NULL, '"+a.getSite()+"')";
		

	
		try {
			con.connection();
			stm=con.getJdbcConnection().createStatement();
			stm.executeUpdate(sql);
			stm.executeUpdate(sql2);

			

			state=true;
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
			state=false;
			e.printStackTrace();
		}
		
		return state;
	}
	
	public int check(Regis email) {
		
		
		 Statement stm;
		 ResultSet rs= null;
		 
		 String sql3="SELECT count(customer_id) FROM customers WHERE email_addres = '"+email.getEmail()+"'";
		 
		try {
			con.connection();
			stm=con.getJdbcConnection().createStatement();
			rs = stm.executeQuery(sql3);
		
			if (rs.next()) {
			return rs.getInt(1);
			}
			return 1; 
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 1;
	}
	
}
}




