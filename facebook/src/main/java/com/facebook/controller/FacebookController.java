package com.facebook.controller;

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
		System.out.println("profile deleted");
	}

	public void viewProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("profile viewed");
	}

	public void editProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("profile edited");
	}

	public void searchProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("profile found");
	}

	public void viewAllProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("all profile viewed");
	}
}
