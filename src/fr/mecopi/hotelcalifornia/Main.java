package fr.mecopi.hotelcalifornia;

public class Main {

	public static void main(String[] args) {
		Utils.InitPrices(); //Initialiazing prices
		Utils.InitRooms(); //Initialiazing hostel rooms
		new Client(); //Create new client object
	}
	
}
