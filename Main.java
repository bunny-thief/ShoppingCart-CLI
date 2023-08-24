import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart(items, scanner);
        shoppingCart.run();
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
            System.out.println("1 - Add item");
            System.out.println("2 - Remove item");
            System.out.println("3 - Display items");
            System.out.println("4 - Exit\n");

            System.out.println("Select an option from the menu (1-4):");

            int choice = Integer.valueOf(scanner.nextLine());

            if (choice == 1) {
                addItemToList();
                continue;
            }

            if (choice == 2) {
                if (!shoppingCart.isEmpty()) {

                    String removed = removeItemFromList();

                    if (removed.equals("Item was not found!")) {
                        System.out.println(removed + "\n");
                    } else {

                        if (removed.endsWith("s")) {
                            System.out.printf("%s were removed from the shopping cart.\n\n", removed);
                        }
                        System.out.printf("%s was removed from the shopping cart.\n\n", removed);
                    }
                } else {
                    System.out.println("Your shopping card is empty.\n");
                }
                continue;
            }

            if (choice == 3) {
                displayItems();
            }

            if (choice == 4) {
                exit();
                break;
            }
        }
    }

    public void addItemToList() {
        System.out.println("Enter item name:");
        String newItem = scanner.nextLine();

        shoppingCart.add(newItem);

        if (newItem.equals("s")) {
            System.out.printf("%s were added to the shopping cart.\n\n", newItem);
        } else {
            System.out.printf("%s was added to the shopping cart.\n\n", newItem);
        }
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
        if (shoppingCart.size() > 0) {

            System.out.println("\n* * * * * * * * * *\n");
            System.out.println("Items in shopping cart");
            for (int i = 0; i < shoppingCart.size(); i++) {
                System.out.printf("%d - %s\n", i + 1, shoppingCart.get(i));
            }
            System.out.println("\n* * * * * * * * * * \n");
        } else {
            System.out.println("Your shopping cart is empty.\n");
        }
    }

    public void exit() {
        displayItems();
        System.out.println("\nThanks for shopping with us!");
    }
}