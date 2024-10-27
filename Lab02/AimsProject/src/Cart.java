package src;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc; 
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The disc has been added. The cart is almost full.");
            } else {
                System.out.println("The disc has been added.");
            }
        } else {
            System.out.println("Can't add disc to full cart.");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                qtyOrdered--;
                System.arraycopy(itemsOrdered, i + 1, itemsOrdered, i, qtyOrdered - i);
                itemsOrdered[qtyOrdered] = null; // Clear the last element
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not in cart.");
    }
    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}

