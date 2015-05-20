package me.sam4215.alchemy;

import java.util.Random;

import static java.lang.System.out;

public class Board {
  static RandomInt randomInt = new RandomInt();
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
  public static String thisCard = cards[randomInt.getRandomNumber(0, 3)];
  public static String[] special = {
  "Ooh, a dragon!", 
  "Hide!", 
  "Ooh boy.", 
  "Well, this is not good."
  };

  public static String thisSpecialCard = special[randomInt.getRandomNumber(0, 3)];
  public static void start() {
    p1s = 0;
    p2s = 0;
    try {
      Thread.sleep(100);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    playGame();
  }
  public static void playGame() {
    while(p1s <= 25 && p2s <= 25) {
      dice.roll();
    if(whoseTurn == 1) {
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
        if(randomInt.getRandomNumber(1, 10) > 5 || randomInt.getRandomNumber(1, 10) < 0) {
          System.out.println(thisCard);
          double nextSpace = p1s + dice.outputNow;
          nextSpace = p1s;
        }
        else {
          System.out.println(thisSpecialCard);
          double nextSpace = p1s + dice.outputNow;
          nextSpace = p1s;
      }
      whoseTurn = 2;
    } else {
      try {
        if (p2s == 1) {
          out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
          out.println(s1);
        }
        if (p2s == 2) {
          out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
          out.println(s2);
          Thread.sleep(10);
        }
        if (p2s == 3) {
          out.println(s3);
          Thread.sleep(10);
        }
        if (p2s == 4) {
          out.println(s4);
          Thread.sleep(10);
        }
        if (p2s == 5) {
          out.println(s5);
          Thread.sleep(10);
        }
        if (p2s == 6) {
          out.println(s6);
          Thread.sleep(10);
        }
        if (p1s == 7) {
          out.println(s7);
          Thread.sleep(10);
        }
        if (p2s == 8) {
          out.println(s8);
          Thread.sleep(10);
        }
        if (p2s == 9) {
          out.println(s9);
          Thread.sleep(10);
        }
        if (p2s == 10) {
          out.println(s10);
          Thread.sleep(10);
        }
        if (p2s == 11) {
          out.println(s11);
          Thread.sleep(10);
        }
        if (p2s == 12) {
          out.println(s12);
          Thread.sleep(10);
        }
        if (p2s == 13) {
          out.println(s13);
          Thread.sleep(10);
        }
        if (p2s == 14) {
          out.println(s14);
          Thread.sleep(10);
        }
        if (p2s == 15) {
          out.println(s15);
          Thread.sleep(10);
        }
        if (p2s == 16) {
          out.println(s16);
          Thread.sleep(10);
        }
        if (p2s == 17) {
          out.println(s17);
          Thread.sleep(10);
        }
        if (p2s == 18) {
          out.println(s18);
          Thread.sleep(10);
        }
        if (p2s == 19) {
          out.println(s19);
          Thread.sleep(10);
        }
        if (p2s == 20) {
          out.println(s20);
          Thread.sleep(10);
        }
        if (p2s == 21) {
          out.println(s21);
          Thread.sleep(10);
        }
        if (p2s == 22) {
          out.println(s22);
          Thread.sleep(10);
        }
        if (p2s == 23) {
          out.println(s23);
          Thread.sleep(10);
        }
        if (p2s == 24) {
          out.println(s24);
          Thread.sleep(10);
        }
        if (p2s == 25) {
          out.println(s25);
          Thread.sleep(10);
        }
      } catch(InterruptedException e) {
        System.out.println("We're experiencing some difficulties (error code 2), stack trace:");
        e.printStackTrace();
      }
        if(randomInt.getRandomNumber(1, 10) > 5 || randomInt.getRandomNumber(1, 10) < 0) {
          System.out.println(thisCard);
          double nextSpace = p2s + dice.outputNow;
        }
        else {
          System.out.println(thisSpecialCard);
          double nextSpace = p2s + dice.outputNow;
          nextSpace = p2s;
        }
    whoseTurn = 1;
    }
  if(p1s >= 25  || p2s >= 25) {
    break;
  }
  }
  System.out.println("You win!");
  System.exit(0);
  }
}
