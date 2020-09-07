package com.skilldistillery.foodtruckproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) { // The only static method in the project
		ArrayList<FoodTruck> foodTrucks = new ArrayList<FoodTruck>(); // dynamic array of FoodTruck objects
		Scanner scanner; // scanner
		String name, foodType;
		int rating, count = 0;
		char choice;

		System.out.println("Welcome to Food Truck App! The best way to rate local food trucks." );
		System.out.println();
		System.out.println("Let's get started.\nEnter up to five food trucks. Type QUIT to end. ");
		do { // loop
			scanner = new Scanner(System.in); // initialize the scanner
			System.out.println("Food truck # " + String.valueOf(count + 1) + ": ");
//			System.out.print("Name: ");
			name = scanner.nextLine(); // set the "name" value to the text typed by the user
			if (name.toUpperCase().equals("QUIT"))
				break; // if the user types "quit" then stop the input (break the loop)
			System.out.print("Nice. What type of food is that? ");
			foodType = scanner.nextLine(); // set the "food type" value to the text typed by the user
			System.out.print("Mmm, sounds good. How would you rank " + name + " on a scale of 1 - 10? ");
			rating = scanner.nextInt(); // set the "rating" value to the text typed by the user
			foodTrucks.add(new FoodTruck(name, foodType, rating)); // create/ add the truck object to the array
			count++; // increment the number of food trucks created
		} while (count < 5); // loop while the is count is less than five

		do { // loop
			System.out.println("\nWhat would you like to do now? Type a line number to choose: ");
			System.out.println("1. See a list of all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. See the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			System.out.print("Choice: ");
			choice = scanner.nextLine().charAt(0); // set the "choice" value to the 1st character of the text typed by
													// the user
			switch (choice) {
			case '1': // if the choice value equals '1' (the user type 1)
				System.out.println("Here's a list of food trucks you entered: ");
				for (int i = 0; i < foodTrucks.size(); i++) { // loop
					System.out.println(foodTrucks.get(i).toString()); // display all the existing food trucks one by one
				}
				;
				break;
			case '2': // if the choice value equals '2' (the user type 2)
				int sumRating = 0; // sum of all ratings
				double avgRating; // average of ratings
				for (int i = 0; i < foodTrucks.size(); i++) // loop
					sumRating += foodTrucks.get(i).getRating(); // calculate the sum
				avgRating = (double) sumRating / (double) foodTrucks.size(); // the average = sum divided by the trucks
																				// number
				System.out.println("The average rating is : " + avgRating); // print the result to the screen
				break;
			case '3': // if the choice value equals '3' (the user type 3)
				int rank = 0; // initialize the rank of the highest rating to 0
				int highestRating = foodTrucks.get(rank).getRating(); // initialize the highest rating value to the
																		// first rating value
				for (int i = 1; i < foodTrucks.size(); i++) // loop
					if (highestRating < foodTrucks.get(i).getRating()) {
						highestRating = foodTrucks.get(i).getRating(); // update the highest rating value with a highest
																		// value if exists
						rank = i; // update the rank value if exists
					}
				System.out.println("Your highest rated truck is " + foodTrucks.get(rank).toString());
				break;
			case '4': // if the choice value equals '4' (the user type 4)
				System.out.println("All done! Thanks for using Food Truck App. Enjoy your meal. ");
				break;
			default: // if the choice value is not in the set {1, 2, 3, 4}
				System.out.println("That's not a valid choice. Enter a number between 1 and 4:");
				break;
			}
		} while (choice != '4'); // loop until the user type '4'

	}
}
