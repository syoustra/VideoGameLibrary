package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Library library = new Library(this);


    // Menu to prompt user for library options
    public void startMenu () {

        System.out.println("Welcome to the Video Game Library. What would you like to do?  \n" +
                "1. Add a game to the Library \n" +
                "2. Remove a game from the Library \n" +
                "3. View what is currently in the Library \n" +
                "4. Check a game out \n" +
                "5. Check a game in \n" +
                "6. View checked out games \n" +
                "7. Exit the program");

        try {

            switch (input.nextInt() /* User Input */) {

                case 1:
                    // Add game
                    System.out.println("You have chosen to add a game. \n" +
                        "What is the title of this game?");
                    input.nextLine();
                    Game game = new Game(input.nextLine());
                    System.out.println("You have added " + game.getTitle() + " to your library, this game can now be checked out.");
                    library.addGame(game);
                    break;
                case 2:
                    //Remove game
                    System.out.println("You have chosen to remove a game from your library. \n" +
                        "Here is a list of games, type the number of the one you would like to remove.");
                    //Create method to list all games available in the library that can be removed
                    library.removeGame(input.nextInt());

                    break;
                case 3:
                    //View library
                    break;
                case 4:
                    //Check out game
                    System.out.println("You have chosen to check out a game from your library. \n" +
                        "Here is a list of games, type the number of the one you would like to check out.");
                    //List all available games
                    library.checkoutGame(input.nextInt());
                    break;
                case 5:
                    //Check in game
                    break;
                case 6:
                    //View checked out games
                    break;
                case 7:
                    //Exit program
                    break;
                default:
                    //Prompt user to pick a correct number, loop back to menu
                    break;


            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 - 7");
            startMenu();

        }
    }

}
