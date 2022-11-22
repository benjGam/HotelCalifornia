package fr.mecopi.hotelcalifornia;

public class Main {

	private static Client client;
	
	public static void main(String[] args) {
		Utils.InitPrices();
		Utils.InitRooms();
		client = new Client();
	}
	
}
