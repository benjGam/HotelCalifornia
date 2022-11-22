package fr.mecopi.hotelcalifornia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

	public static List<Room> availablesRooms = new ArrayList<Room>();
	private static List<List<Integer>> prices = new ArrayList<>();
	
	public static void InitPrices() 
	{
		prices.add((List<Integer>) Arrays.asList(100, 120, 130, 150));
		prices.add((List<Integer>) Arrays.asList(130, 160, 170, 190));
		prices.add((List<Integer>) Arrays.asList(170, 200, 210, 230, 270, 350));
		prices.add((List<Integer>) Arrays.asList(200, 230, 240, 260, 300, 400));
	}
	public static void InitRooms() 
	{
		for(int c = 0; c <= 6; c++) {
			for(int p = 1; p <= 4; p++) {
				try {
					availablesRooms.add(new Room(c, p, prices.get(p-1).get(c-1)));
				} catch (Exception e) {}
			}
		}
	}
	public static Room GetRoom(int capacity, int category) 
	{
		for(Room room : availablesRooms) {
			if(room.getCapacity() == capacity && room.getCategory() == category) {
				return room;
			}
		}
		return null;
	}
	public static void PrintCategories() 
	{
		System.out.println("1. Lavabo");
		System.out.println("2. WC, Télévision");
		System.out.println("3. Cabine Douche, Télévision");
		System.out.println("4. WC, Cabine Douche, Télévision");
		System.out.println("5. WC, Salle de bain + Douche, Télévision");
		System.out.println("6. 2 pièces, Salle de bain + douche, WC, Télévision");
	}
	public static int TryParse(String entry) {
		try {
			return Integer.parseInt(entry);
		} catch (Exception e){
			return 0;
		}
	}
	public static int TryParse(String entry, int default_value) {
		try {
			return Integer.parseInt(entry);
		} catch (Exception e){
			return default_value;
		}
	}
	

}
