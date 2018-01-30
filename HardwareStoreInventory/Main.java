import java.util.Scanner;
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

    private int userInput () {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        // reader.close();
        return n;
    }

    private void userSelection () {
        int selection = main.userInput();
        switch (selection) {
            case 1: System.out.println("case1");
                break;
            case 2: System.out.println("case2");
                break;
            case 3: System.out.println("case3");
                break;
            case 4: System.out.println("case4");
                break;
            case 5: System.out.println("case5");
                break;
            case 6: System.out.println("case6");
                break;
        }
    }

    public static void main (String[] args) {
        main.displayMenu();
        main.userSelection();

    }

    private static final int SHOW_EXISTING_ITEMS = 1,
                         ADD_NEW_QUANTITY = 2,
                         DELETE_QUANTITY = 3,
                         SEARCH_FOR_ITEM = 4,
                         LIST_ITEMS_BELOW_QUANTITY = 5,
                         EXIT = 6;

    private static Main main = new Main();
}
