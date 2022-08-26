package com.facebook.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;

public class FacebookController {
	public void createProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your password");
		String password=sc.next();
		
		System.out.println("enter your email");
		String email=sc.next();
		
		System.out.println("enter your address");
		String address=sc.next();
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setPassword(password);
		fb.setEmail(email);
		fb.setAddress(address);
		
		FacebookService fs=new FacebookService();
		int i=fs.createProfileService(fb);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("could not create profile");
		}
	}

	public void deleteProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email to delete profile");
		String email=sc.next();
		FacebookUser fb=new FacebookUser();
		fb.setEmail(email);
		
		FacebookService fs=new FacebookService();
		int i=fs.deleteProfileService(fb);
		
		if(i>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("could not delete profile");
		}
	}

	public void viewProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email to view profile");
		String email=sc.next();
		FacebookUser fb=new FacebookUser();
		fb.setEmail(email);
		
		FacebookService fs=new FacebookService();
		FacebookUser f1=fs.viewProfileService(fb);
		
		if(f1!=null) {
			System.out.println("Profile detail is below");
			System.out.println("Name is "+f1.getName());
			System.out.println("Password is "+f1.getPassword());
			System.out.println("Email is "+f1.getEmail());
			System.out.println("Address is "+f1.getAddress());
		}
		else {
			System.out.println("profile not found");
		}
		
	}

	public void editProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("profile edited");
	}

	public void searchProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name to search profile");
		
		String name=sc.next();
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		
		FacebookService fs=new FacebookService();
		ArrayList<FacebookUser> ll=fs.searchProfile(fb);
		
		System.out.println(ll.size()+"  record found");
		
		for(FacebookUser f1:ll) {
			System.out.println("*********************");
			System.out.println("Profile detail is below");
			System.out.println("Name is "+f1.getName());
			System.out.println("Password is "+f1.getPassword());
			System.out.println("Email is "+f1.getEmail());
			System.out.println("Address is "+f1.getAddress());
		}
		
		
	}

	public void viewAllProfile() {
		FacebookService fs=new FacebookService();
		ArrayList<FacebookUser> ll=fs.viewAllProfile();
		
		System.out.println(ll.size()+"  record found");
		
		for(FacebookUser f1:ll) {
			System.out.println("*********************");
			System.out.println("Profile detail is below");
			System.out.println("Name is "+f1.getName());
			System.out.println("Password is "+f1.getPassword());
			System.out.println("Email is "+f1.getEmail());
			System.out.println("Address is "+f1.getAddress());
		}
	}
}
















