package fr.mecopi.hotelcalifornia;

public class Room {

	private int _capacity;
	private int _category;
	private int _price;
	
	public Room(int category, int capacity, int price) 
	{
		_capacity = capacity;
		_category = category;
		_price = price;
	}
	
	//Getters
	
	public int getCapacity() {
		return _capacity;
	}
	public int getPrice() {
		return _price;
	}
	public int getCategory() {
		return _category;
	}
}
