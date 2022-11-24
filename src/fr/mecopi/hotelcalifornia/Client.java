package fr.mecopi.hotelcalifornia;

import java.util.Scanner;

public class Client {
	
	private Room reservedRoom;
	
	public Client() {
		askRoom(); //Client ask for a room
	}
	@SuppressWarnings("resource")
	public void askRoom() {
		Scanner buffer = new Scanner(System.in);
		System.out.print("Pour combien de personne : ");
		int forHowMany = Utils.TryParse(buffer.nextLine(), 1); //Trying to parse user input as Integer with default value : 1
		System.out.println("Quelle catégorie de chambe voulez vous : ");
		Utils.PrintCategories(); //Show categories
		int category = Utils.TryParse(buffer.nextLine(), 1); //Trying to parse user input as Integer
		reservedRoom = Utils.GetRoom(forHowMany, category); //Getting a room matching with client needs
		if(reservedRoom != null) {
			Utils.availablesRooms.remove(reservedRoom);
			System.out.println("Ça vous fera " + reservedRoom.getPrice() + " €");
		} else {
			System.out.println("Aucune chambre ne correspond à vos besoin");
		}
	}
	
	
}
