public class Board {
  public int space;
  public String[] cards = {"Everthing seems quiet, that's strange....", 
  "Time to take a rest....", 
  "Fight the odd battle.", 
  "This, I daresay, is quite strange...."
  }
  public String[] special = {"Ooh, a dragon!", "Hide!", "Ooh boy."}
  public void start() {
    space = 1;
  }
  public void nextTurn() {
    if(space >= 25) {
      System.out.println("You win!");
      System.exit(0);
    }
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
}
