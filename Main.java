interface LibraryOperations 
{
    void addItem(String item);
    void displayAvailableItems();
    void removeItem(String item);
}

class Library implements LibraryOperations {
    private String[] items;
    private int capacity;
    private int itemCount;

    public Library(int capacity) {
        this.capacity = capacity;
        this.items = new String[capacity];
        this.itemCount = 0;
    }
    public void addItem(String item) {
        if (itemCount < capacity) {
            items[itemCount] = item;
            itemCount++;
            System.out.println(item + " has been added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }
    public void displayAvailableItems() {
        System.out.println("Available items in the library:");
        for (String item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
    public void removeItem(String item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(item)) {
                items[i] = null;
                System.out.println(item + " has been removed from the library.");
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);  

   
        library.addItem("Book 1");
        library.addItem("Book 2");
        library.addItem("Magazine 1");

 
        library.displayAvailableItems();

        library.removeItem("Book 1");

        library.displayAvailableItems();
    }
}