package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public FacebookUser viewProfileDAO(FacebookUser fb) {
		FacebookUser f1=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdatabase","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from facebook where email=?");
			
			ps.setString(1, fb.getEmail());
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				f1=new FacebookUser();
				f1.setName(n);
				f1.setPassword(p);
				f1.setEmail(e);
				f1.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f1;
	}

	public int deleteProfileDAO(FacebookUser fb) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdatabase","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("delete from facebook where email=?");
			
			ps.setString(1, fb.getEmail());
			
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<FacebookUser> viewAllProfile() {
		ArrayList<FacebookUser> l=new ArrayList<FacebookUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdatabase","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from facebook");
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				FacebookUser f1=new FacebookUser();
				f1.setName(n);
				f1.setPassword(p);
				f1.setEmail(e);
				f1.setAddress(a);
				
				l.add(f1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public ArrayList<FacebookUser> searchProfile(FacebookUser fb) {
		ArrayList<FacebookUser> l=new ArrayList<FacebookUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankitdatabase","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from facebook where name=?");
			ps.setString(1, fb.getName());
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				FacebookUser f1=new FacebookUser();
				f1.setName(n);
				f1.setPassword(p);
				f1.setEmail(e);
				f1.setAddress(a);
				
				l.add(f1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
