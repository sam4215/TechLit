public class Board {
  public int space;
  public String[] cards = {
  "Everthing seems quiet, that's strange....", 
  "Time to take a rest....", 
  "Fight the odd battle.", 
  "This, I daresay, is quite strange...."
  }
  public String[] special = {
  "Ooh, a dragon!", 
  "Hide!", 
  "Ooh boy.", 
  "Well, this is not good."
  }
  public void start() {
    space = 1;
    playGame();
  }
  public void playGame() {
    while(space <= 25) {
      int s = Math.random();
      if(s > 5 || s < 0) {
        for(String str : cards) {
          System.out.println(str);
        }
        space++;
      }
      else {
        for(String str : special) {
          System.out.println(str);
        }
        int nextSpace = space + Math.random();
        nextSpace = space;
     }
    }
      System.out.println("You win!");
      System.exit(0);
  }
}
