import java.util.ArrayList;
// Importing the ArrayList class from the java.util package

import java.util.Comparator;
// Importing the Comparator class from the java.util package

import java.util.List;
// Importing the List interface from the java.util package

import java.util.Scanner;
// Importing the Scanner class from the java.util package

public class VideoGameDatabase {
    private static final List<VideoGame> gameData = new ArrayList<>();
    // Creating a static ArrayList to store video game data

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating a Scanner object to read user input

        System.out.print("\033[1;34m");
        // Setting the console text color to blue

        System.out.println("  _   _  U _____ u  _       _       U  ___ u  _   \n" +
                " |'| |'| \\| ___\"|/ |\"|     |\"|       \\/\"_ \\/U|\"|u \n" +
                "/| |_| |\\ |  _|\" U | | u U | | u     | | | |\\| |/ \n" +
                "U|  _  |u | |___  \\| |/__ \\| |/__.-,_| |_| | |_|  \n" +
                " |_| |_|  |_____|  |_____| |_____|\\_)-\\___/  (_)  \n" +
                " //   \\\\  <<   >>  //  \\\\  //  \\\\      \\\\    |||_ \n" +
                "(_\") (\"_)(__) (__)(_\")(\"_)(_\")(\"_)    (__)  (__)_)");
        // Printing a video game database ASCII art logo

        while (true) {
            System.out.println("             ---Video Game Database ---\n" +
                    "            1. Add a new game\n" +
                    "            2. Compare games by size(GB)\n" +
                    "            3. Compare games by platform\n" +
                    "            4. Compare games by title\n" +
                    "            5. Compare games by year\n" +
                    "            6. Compare games by price(￥)\n" +
                    "            0. Exit");
            // Printing the menu options

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            // Reading the user's choice

            switch (choice) {
                case 1:
                    addGame(scanner);
                    break;
                case 2:
                    compareGamesBySize();
                    break;
                case 3:
                    compareGamesByPlatform();
                    break;
                case 4:
                    compareGamesByTitle();
                    break;
                case 5:
                    compareGamesByYear();
                    break;
                case 6:
                    compareGamesByPrice();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void addGame(Scanner scanner) {
        System.out.print("Enter the size of the game: ");
        String size = scanner.nextLine();
        // Prompting the user to enter the size of the game

        System.out.print("Enter the platform of the game: ");
        String platform = scanner.nextLine();
        // Prompting the user to enter the platform of the game

        System.out.print("Enter the title of the game: ");
        String title = scanner.nextLine();
        // Prompting the user to enter the title of the game

        System.out.print("Enter the year the game was produced: ");
        int year = scanner.nextInt();
        // Prompting the user to enter the year the game was produced

        System.out.print("Enter the price of the game: ");
        float price = scanner.nextFloat();
        // Prompting the user to enter the price of the game

        VideoGame game = new VideoGame(size, platform, title, year, price);
        gameData.add(game);
        // Creating a new VideoGame object and adding it to the gameData list

        System.out.println("Game added successfully!");
    }
    private static void compareGamesBySize() {
        if (gameData.isEmpty()) {
            System.out.println("No games found!");
            return;
        }
        // Checking if there are any games in the database

        gameData.sort(Comparator.comparing(VideoGame::getSize));
        // Sorting the gameData list based on the size of the games

        for (VideoGame game : gameData) {
            System.out.println(game.getTitle() + ": " + game.getSize());
        }
        // Printing the titles and sizes of all games in ascending order of size
    }
    private static void compareGamesByPlatform() {
        if (gameData.isEmpty()) {
            System.out.println("No games found!");
            return;
        }
        // Checking if there are any games in the database

        gameData.sort(Comparator.comparing(VideoGame::getPlatform));
        // Sorting the gameData list based on the platform of the games

        for (VideoGame game : gameData) {
            System.out.println(game.getTitle() + ": " + game.getPlatform());
        }
        // Printing the titles and platforms of all games in ascending order of platform
    }
    private static void compareGamesByTitle() {
        if (gameData.isEmpty()) {
            System.out.println("No games found!");
            return;
        }
        // Checking if there are any games in the database

        gameData.sort(Comparator.comparing(VideoGame::getTitle));
        // Sorting the gameData list based on the title of the games

        for (VideoGame game : gameData) {
            System.out.println(game.getTitle());
        }
        // Printing the titles of all games in ascending order
    }
    private static void compareGamesByYear() {
        if (gameData.isEmpty()) {
            System.out.println("No games found!");
            return;
        }
        // Checking if there are any games in the database

        gameData.sort(Comparator.comparingInt(VideoGame::getYear));
        // Sorting the gameData list based on the year of production of the games

        for (VideoGame game : gameData) {
            System.out.println(game.getTitle() + ": " + game.getYear());
        }
        // Printing the titles and years of production of all games in ascending order of year
    }
    private static void compareGamesByPrice() {
        if (gameData.isEmpty()) {
            System.out.println("No games found!");
            return;
        }
        // Checking if there are any games in the database

        gameData.sort(Comparator.comparingDouble(VideoGame::getPrice));
        // Sorting the gameData list based on the price of the games

        for (VideoGame game : gameData) {
            System.out.println(game.getTitle() + ": " + game.getPrice());
        }
        // Printing the titles and prices of all games in ascending order of price
    }
}
