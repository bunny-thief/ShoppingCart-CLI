import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

    }

}

class ShoppingCart {
    ArrayList<String> shoppingCart;
    Scanner scanner;

    public ShoppingCart(ArrayList<String> shoppingCart, Scanner scanner) {
        this.shoppingCart = shoppingCart;
        this.scanner = scanner;
    }

    public void run() {

        while (true) {
            System.out.printf("1 - Add item");
            System.out.println("2 - Remove item");
            System.out.println("3 - Display items");
            System.out.println("4 - Exit\n");

            System.out.println("Select an opton from the menu:");

            int choice = Integer.valueOf(scanner.nextLine());

            if (choice == 1) {
                addItemToList();
                continue;
            }

            if (choice == 2) {
                String removed = removeItemFromList();

                if (removed.equals("Item was not found!")) {
                    System.out.println(removed);
                } else {
                    System.out.printf("%d was removed from the shoppint cart.");
                }
                continue;
            }

            if (choice == 3) {
                displayItems();
            }
        }

    }

    public void addItemToList() {
        System.out.println("Enter item name:");
        String newItem = scanner.nextLine();

        shoppingCart.add(newItem);

        System.out.printf("%s was added to the shopping card.", newItem);
    }

    public String removeItemFromList() {
        System.out.println("Enter the item to remove:");
        String itemToRemove = scanner.nextLine();

        for (int i = 0; i < shoppingCart.size(); i++) {
            if (itemToRemove.equals(shoppingCart.get(i))) {
                return shoppingCart.remove(i);
            }
        }
        return "Item was not found!";
    }

    public void displayItems() {
        System.out.println("* * * * * * * * * *");
        System.out.println("Items in shopping card");
        for (int i = 0; i < shoppingCart.size(); i++) {
            System.out.printf("%d - %s", i + 1, shoppingCart.get(i));
        }
        System.out.println("* * * * * * * * * * ");
    }
}
