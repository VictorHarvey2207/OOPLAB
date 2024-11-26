package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD \"" + dvd.getTitle() + "\"has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("DVD \"" + dvd.getTitle() + "\"has been removed from the store.");
        } else {
            System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
        }
    }
}
