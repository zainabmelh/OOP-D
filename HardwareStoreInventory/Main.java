import java.util.ArrayList;
public class Main {
    private void displayMenu () {
        System.out.println("\nMain Menu");
        System.out.println("\n    " + SHOW_EXISTING_ITEMS + ". Show all existing items in stock and their quantities." +
        "\n    " + ADD_NEW_QUANTITY + ". Add a new quantity of a specific item to the stock." +
        "\n    " + DELETE_QUANTITY + ". Remove a certain quantity of a specific item type." +
        "\n    " + SEARCH_FOR_ITEM + ". Search for an item (given its name or part of its name)." +
        "\n    " + LIST_ITEMS_BELOW_QUANTITY + ". Show a list of all item below a certain quantity." +
        "\n    " + EXIT + ". Exit program.");
    }

    public static void main (String[] args) {
        main.displayMenu();
    }

    private static final int SHOW_EXISTING_ITEMS = 1,
                         ADD_NEW_QUANTITY = 2,
                         DELETE_QUANTITY = 3,
                         SEARCH_FOR_ITEM = 4,
                         LIST_ITEMS_BELOW_QUANTITY = 5,
                         EXIT = 6;

    private static Main main = new Main();
}
