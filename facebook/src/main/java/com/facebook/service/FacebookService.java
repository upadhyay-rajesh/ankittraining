package com.facebook.service;

import java.util.ArrayList;

import com.facebook.dao.FacebookDAO;
import com.facebook.entity.FacebookUser;

public class FacebookService {

	public int createProfileService(FacebookUser fb) {
		FacebookDAO fd=new FacebookDAO();
		int i=fd.createProfileDAO(fb);
		return i;
	}

	public FacebookUser viewProfileService(FacebookUser fb) {
		FacebookDAO fd=new FacebookDAO();
		FacebookUser f1=fd.viewProfileDAO(fb);
		return f1;
	}

	public int deleteProfileService(FacebookUser fb) {
		FacebookDAO fd=new FacebookDAO();
		int i=fd.deleteProfileDAO(fb);
		return i;
	}

	public ArrayList<FacebookUser> viewAllProfile() {
		FacebookDAO fd=new FacebookDAO();
		ArrayList<FacebookUser> d=fd.viewAllProfile();
		return d;
	}

	public ArrayList<FacebookUser> searchProfile(FacebookUser fb) {
		FacebookDAO fd=new FacebookDAO();
		ArrayList<FacebookUser> d=fd.searchProfile(fb);
		return d;
	}

}
