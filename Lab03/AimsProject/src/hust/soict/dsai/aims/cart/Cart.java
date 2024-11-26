import hust.soict.dsai.aims.disc.DigitalVideoDisc;

package hust.soict.dsai.aims.cart;
public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];
	
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_ORDERED){
            System.out.println("The cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
    }

	public void printOrder(){
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString());
		}
	}

	public void searchById(int id){
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}
		if (!found){
			System.out.println("No DVD found");
		}
	}
	public void searchByTitle(String title){
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle() == title) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}
		if (!found){
			System.out.println("No DVD found");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			if (qtyOrdered >= MAX_ORDERED) {
				System.out.println("The cart is almost full");
			}
			if (qtyOrdered + dvdList.length > MAX_ORDERED) {
				System.out.println("Can't add that many discs");
			}
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered += 1;
		}
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)  {
		if (qtyOrdered >= MAX_ORDERED) {
			System.out.println("The cart is almost full");
		}
		if (qtyOrdered + 2 > MAX_ORDERED) {
			System.out.println("Can't add that many discs");
		}
		else{
			itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered += 1;
			itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered += 1;
            System.out.println("The discs has been added");
		}
	}
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("The disc has been removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
}