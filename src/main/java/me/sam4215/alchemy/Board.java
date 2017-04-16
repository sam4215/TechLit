package me.sam4215.alchemy;

import static java.lang.System.out;

public class Board {
  static Dice dice = new Dice();
  public static String s1 = "|O| | | | | | | | | | | | | | | | | | | | | | | | ||";
  public static String s2 = "| |O| | | | | | | | | | | | | | | | | | | | | | | ||";
  public static String s3 = "| | |O| | | | | | | | | | | | | | | | | | | | | | ||";
  public static String s4 = "| | | |O| | | | | | | | | | | | | | | | | | | | | ||";
  public static String s5 = "| | | | |O| | | | | | | | | | | | | | | | | | | | ||";
  public static String s6 = "| | | | | |O| | | | | | | | | | | | | | | | | | | ||";
  public static String s7 = "| | | | | | |O| | | | | | | | | | | | | | | | | | ||";
  public static String s8 = "| | | | | | | |O| | | | | | | | | | | | | | | | | ||";
  public static String s9 = "| | | | | | | | |O| | | | | | | | | | | | | | | | ||";
  public static String s10 = "| | | | | | | | | |O| | | | | | | | | | | | | | | ||";
  public static String s11 = "| | | | | | | | | | |O| | | | | | | | | | | | | | ||";
  public static String s12 = "| | | | | | | | | | | |O| | | | | | | | | | | | | ||";
  public static String s13 = "| | | | | | | | | | | | |O| | | | | | | | | | | | ||";
  public static String s14 = "| | | | | | | | | | | | | |O| | | | | | | | | | | ||";
  public static String s15 = "| | | | | | | | | | | | | | |O| | | | | | | | | | ||";
  public static String s16 = "| | | | | | | | | | | | | | | |O| | | | | | | | | ||";
  public static String s17 = "| | | | | | | | | | | | | | | | |O| | | | | | | | ||";
  public static String s18 = "| | | | | | | | | | | | | | | | | |O| | | | | | | ||";
  public static String s19 = "| | | | | | | | | | | | | | | | | | |O| | | | | | ||";
  public static String s20 = "| | | | | | | | | | | | | | | | | | | |O| | | | | ||";
  public static String s21 = "| | | | | | | | | | | | | | | | | | | | |O| | | | ||";
  public static String s22 = "| | | | | | | | | | | | | | | | | | | | | |O| | | ||";
  public static String s23 = "| | | | | | | | | | | | | | | | | | | | | | |O| | ||";
  public static String s24 = "| | | | | | | | | | | | | | | | | | | | | | | |O| ||";
  public static String s25 = "| | | | | | | | | | | | | | | | | | | | | | | | |O||";
  public static double p1s;
  public static double p2s;
  public static int whoseTurn = 1; //1 = Player 1, 2 = Player 2
  public static String[] cards = {
  "Everthing seems quiet, that's strange....", 
  "Time to take a rest....", 
  "Fight the odd battle.", 
  "This, I daresay, is quite strange...."
  };
  public static String[] special = {
  "Ooh, a dragon!", 
  "Hide!", 
  "Ooh boy.", 
  "Well, this is not good."
  };
  public static void start() {
    p1s = 1;
    p2s = 1;
    playGame();
  }
  public static void playGame() {
    while(p1s <= 25 && p2s <= 25) {
    if(p1s == 1) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s1);
    }
    if(p1s == 2) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s2);
    }
    if(p1s == 3) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s3);
    }
    if(p1s == 4) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s4);
    }
    if(p1s == 5) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s5);
    }
    if(p1s == 6) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s6);
    }
    if(p1s == 7) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s7);
    }
    if(p1s == 8) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s8);
    }
    if(p1s == 9) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s9);
    }
    if(p1s == 10) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s10);
    }
    if(p1s == 11) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s11);
    }
    if(p1s == 12) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s12);
    }
    if(p1s == 13) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s13);
    }
    if(p1s == 14) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s14);
    }
    if(p1s == 15) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s15);
    }
    if(p1s == 16) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s16);
    }
    if(p1s == 17) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s17);
    }
    if(p1s == 18) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s18);
    }
    if(p1s == 19) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s19);
    }
    if(p1s == 20) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s20);
    }
    if(p1s == 21) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s21);
    }
    if(p1s == 22) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s22);
    }
    if(p1s == 23) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s23);
    }
    if(p1s == 24) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s24);
    }
    if(p1s == 25) {
      out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      out.println(s25);
    }
      if(p2s == 1) {
        out.println(s1);
      }
      if(p2s == 2) {
        out.println(s2);
      }
      if(p2s == 3) {
        out.println(s3);
      }
      if(p2s == 4) {
        out.println(s4);
      }
      if(p2s == 5) {
        out.println(s5);
      }
      if(p2s == 6) {
        out.println(s6);
      }
      if(p1s == 7) {
        out.println(s7);
      }
      if(p2s == 8) {
        out.println(s8);
      }
      if(p2s == 9) {
        out.println(s9);
      }
      if(p2s == 10) {
        out.println(s10);
      }
      if(p2s == 11) {
        out.println(s11);
      }
      if(p2s == 12) {
        out.println(s12);
      }
      if(p2s == 13) {
        out.println(s13);
      }
      if(p2s == 14) {
        out.println(s14);
      }
      if(p2s == 15) {
        out.println(s15);
      }
      if(p2s == 16) {
        out.println(s16);
      }
      if(p2s == 17) {
        out.println(s17);
      }
      if(p2s == 18) {
        out.println(s18);
      }
      if(p2s == 19) {
        out.println(s19);
      }
      if(p2s == 20) {
        out.println(s20);
      }
      if(p2s == 21) {
        out.println(s21);
      }
      if(p2s == 22) {
        out.println(s22);
      }
      if(p2s == 23) {
        out.println(s23);
      }
      if(p2s == 24) {
        out.println(s24);
      }
      if(p2s == 25) {
        out.println(s25);
      }
    if(whoseTurn == 1) {
        double s = Math.random();
        if(s > 5 || s < 0) {
          for(String str : cards) {
            System.out.println(str);
          }
          double nextSpace = p1s + dice.diceRoll;
          nextSpace = p1s;
        }
        else {
          for(String str : special) {
            System.out.println(str);
          }
          double nextSpace = p1s + dice.diceRoll;
          nextSpace = p1s;
      }
      whoseTurn = 2;
    } else {
        double s = Math.random();
        if(s > 5 || s < 0) {
          for(String str : cards) {
            System.out.println(str);
          }
          double nextSpace = p2s + dice.diceRoll;
        }
        else {
          for(String str : special) {
            System.out.println(str);
          }
          double nextSpace = p2s + dice.diceRoll;
          nextSpace = p2s;
        }
    whoseTurn = 1;
    }
  }
  System.out.println("You win!");
  System.exit(0);
  }
}
