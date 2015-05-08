public class Board {
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
    if(whoseTurn = 1) {
        double s = Math.random();
        if(s > 5 || s < 0) {
          for(String str : cards) {
            System.out.println(str);
          }
          p1s++;
        }
        else {
          for(String str : special) {
            System.out.println(str);
          }
          double nextSpace = p1s + Math.random();
          nextSpace = p1s;
      }
      whoseTurn = 2;
    } else {
        double s = Math.random();
        if(s > 5 || s < 0) {
          for(String str : cards) {
            System.out.println(str);
          }
          p2s++;
        }
        else {
          for(String str : special) {
            System.out.println(str);
          }
          double nextSpace = p2s + Math.random();
          nextSpace = p2s;
        }
    whoseTurn = 1;
    }
  }
  System.out.println("You win!");
  System.exit(0);
  }
}
