package com.skilldistillery.foodtrucksproject;

import java.util.Scanner;

public class FoodTrucksApplication {
	public static void main(String[] args) {

//	User Story 1
		Scanner userInput = new Scanner(System.in);

		System.out.println("Welcome to FoodTruckApp! An app to rate the BEST local food trucks.");
		System.out.print("Let's get started.\nEnter the name of a food truck: ");
		String foodTruckName;
		foodTruckName = userInput.next();
		System.out.print("Nice. What type of food is that? ");
		String foodType = userInput.next();
		System.out.print("Mmm, sounds good. How does " + foodTruckName + " rate on a scale of 1 - 10? ");
		int rating = userInput.nextInt();
	}

}

//		foodTruck[] trucks;
//		trucks = new foodTruck[5];
//		trucks[0] = new foodTruck();
//		trucks[1] = new foodTruck();
//		trucks[2] = new foodTruck();
//		trucks[3] = new foodTruck();
//		trucks[4] = new foodTruck();