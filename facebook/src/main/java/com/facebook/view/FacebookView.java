package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;

public class FacebookView {

	public static void main(String[] args) {

		String s = "y";

		while (s.equals("y")) {
			System.out.println("********************MAIN MENU**********");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to delete profile");
			System.out.println("press 3 to view profile");
			System.out.println("press 4 to edit profile");
			System.out.println("press 5 to search profile");
			System.out.println("press 6 to view all profile");

			System.out.println("enter your choice");
			Scanner sc = new Scanner(System.in);

			int c = sc.nextInt();

			FacebookController fc = new FacebookController();

			switch (c) {
			case 1:
				fc.createProfile();

				break;
			case 2:
				fc.deleteProfile();

				break;
			case 3:
				fc.viewProfile();

				break;
			case 4:
				fc.editProfile();

				break;
			case 5:
				fc.searchProfile();

				break;
			case 6:
				fc.viewAllProfile();

				break;
			default:
				System.out.println("wrong choice");
			}
			System.out.println("do you want to continue press y/n");
			s = sc.next();
		}

	}

	

}
