package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);


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
                    break;
                case 2:
                    //Remove game
                    break;
                case 3:
                    //View library
                    break;
                case 4:
                    //Check out game
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
