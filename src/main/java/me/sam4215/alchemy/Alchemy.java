package me.sam4215.alchemy;

import me.sam4215.alchemy.Board;

public class Alchemy {
  private String name = "Alchemy";
  private String creator = "Sam";
  static Board board = new Board();
  public static void main(String[] args) {
    System.out.println("*********************************************\n" + 
                       "*         Welcome to Alchemy!               *\n" +
                       "*    A two-player game made by Sam          *\n" +
                       "* Based on The Alchemyst by Michael Scott   *\n" +
                       "* Roll the dice, get a card, move forward!  *\n" +
                       "* To win: Reach the finish after 25 spaces! *\n" +
                       "*            Good luck!                     *\n" +
                       "*********************************************");
    board.start();
  }
}
    
