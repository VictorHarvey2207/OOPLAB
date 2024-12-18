package hust.soict.cybersecurity.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.cybersecurity.aims.media.Media;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private float total = 0;
	
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}
	
	public float totalCost() {
		total = 0;
		for(Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}
	
	public void print() {
		total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++) { 
			System.out.println((i + 1) + ". DVD - " + itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void searchByID(int id) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("There are no medias that match your search");
		}
	}
	
	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("There are no medias that match your search");
		}
	}
	
	public Media takeByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				return itemsOrdered.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with title: " + title);
		}
		return null;
	}
	
	public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		System.out.println("Sorting by Cost - Title:");
		itemsOrdered.forEach(System.out::println);
	}

	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		System.out.println("Sorting by Title - Cost:");
		itemsOrdered.forEach(System.out::println);
	}
	
	public void clear() {
		this.itemsOrdered = new ArrayList<Media>();
	}
}
