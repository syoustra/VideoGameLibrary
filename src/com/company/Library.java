package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
public class Library {




        public final Menu menu; //any class can use this, but it can never be modified
        private List<Game> gameLibrary = new ArrayList<Game>();
        private List<Game> checkedOutGames = new ArrayList<Game>();
        private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");


        public Library (Menu menu) {
            this.menu = menu;
        }


        protected void addGame (Game game) {
            //will only run if Game-type game is passed
            // Code goes here to add game to wherever we are saving game things to
            gameLibrary.add(game);
            menu.startMenu();
        }


        protected void removeGame(int gameIndex){

            gameIndex -= gameIndex; // makes their input of "1" equal the array index of "0", for example
            gameLibrary.remove(gameIndex);
            System.out.println("This game has been removed from your library.");
            menu.startMenu();
        }

        protected void checkoutGame(int gameIndex) {
            gameIndex -= gameIndex;
            Game game = gameLibrary.get(gameIndex);

            checkedOutGames.add(game);

            Calendar calendar = Calendar.getInstance();
            System.out.println("You checked this game out on: " + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_YEAR, 3);
            System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
            game.setDueDate(dateFormat.format(calendar.getTime()));

            gameLibrary.remove(gameIndex);
            menu.startMenu();



        }
    /*




    * */



}
