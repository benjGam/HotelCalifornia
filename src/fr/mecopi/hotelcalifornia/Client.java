package fr.mecopi.hotelcalifornia;

import java.util.Scanner;

public class Client {
	
	private Room reservedRoom;
	
	public Client() {
		askRoom();
	}
	@SuppressWarnings("resource")
	public void askRoom() {
		Scanner buffer = new Scanner(System.in);
		System.out.print("Pour combien de personne : ");
		int forHowMany = Utils.TryParse(buffer.nextLine(), 1);
		System.out.println("Quelle catégorie de chambe voulez vous : ");
		Utils.PrintCategories();
		int category = Utils.TryParse(buffer.nextLine(), 1);
		reservedRoom = Utils.GetRoom(forHowMany, category);
		if(reservedRoom != null) {
			Utils.availablesRooms.remove(reservedRoom);
			System.out.println("Ça vous fera " + reservedRoom.getPrice() + " €");
		} else {
			System.out.println("Aucune chambre ne correspond à vos besoin");
		}
	}
	
	
}
