package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.facebook.entity.FacebookUser;

public class FacebookDAO {

	public int createProfileDAO(FacebookUser fb) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdatabase","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("insert into facebook values(?,?,?,?)");
			ps.setString(1, fb.getName());
			ps.setString(2, fb.getPassword());
			ps.setString(3, fb.getEmail());
			ps.setString(4, fb.getAddress());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
