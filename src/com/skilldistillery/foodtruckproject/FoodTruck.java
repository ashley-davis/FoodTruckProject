package com.skilldistillery.foodtruckproject;

public class FoodTruck {
	static int nextTruckId=1
			;		// static field (Class variable)
	private double id;					// object field (Instance variable)
	private String name;			// object field (Instance variable)
	private String foodType;		// object field (Instance variable)
	private int rating;				// object field (Instance variable)
	
	public void setId(double ID) {		// setter (method) for setting the truck id value
		this.id = ID;
		}
	public void setName(String Name) {	// setter (method) for setting the truck name
		this.name = Name;
		}
	public void setFoodType(String Type) {	// setter (method) for setting the truck food type
		this.foodType = Type;
		}
	public void setRating(int Rating) {		// setter (method) for setting the truck rating
		this.rating = Rating;
		}
	public double getId() {		// getter (method) for getting the truck id value
		return this.id;
	}
	public String getName() {	// getter (method) for getting the truck name value
		return this.name;
	}
	public String getFoodType() {	// getter (method) for getting the truck food type value
		return this.foodType;
	}
	public int getRating() {	// getter (method) for getting the truck rating value
		return this.rating;
	}
	FoodTruck() {				// default constructor
		setId(this.nextTruckId);	// set the id value to the "nextTruckId" field value
		setName(null);				// set the name value to null
		setFoodType(null);			// set the food type value to null
		setRating(0);				// set the rating value to null
		this.nextTruckId++;			// increment the "nextTruckId" field value
	}
	FoodTruck(String Name, String FoodType, int Rating) {	// constructor with parameters
		setId(this.nextTruckId);	// set the id value to the "nextTruckId" field value
		setName(Name);				// set the name value to the 1st parameter value
		setFoodType(FoodType);		// set the food type value to the 2nd parameter value
		setRating(Rating);			// set the rating value to the 3rd parameter value
		this.nextTruckId++;			// increment the "nextTruckId" field value
	}
	public String toString() {		// toString method that return all food truck fields
		return "Id: "+this.id+", Name: "+this.name+", Food type: "+this.foodType+", Rating: "+this.rating+"\n";
	}
}


